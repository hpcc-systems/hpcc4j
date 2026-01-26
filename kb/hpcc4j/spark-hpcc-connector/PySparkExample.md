# Spark-HPCC Connector for HPCC Systems Platform and Spark Connectivity

This example demonstrates how to use the Spark-HPCC Connector to read and write data from / to HPCC Systems clusters, as well as providing basic setup information for the Spark-HPCC connector.

## Spark-HPCC Connector Installation:

---

The Spark-HPCC Connector jar and its dependencies need to be made available to all Spark worker nodes and the Spark driver application. This can be done by adding the Spark-HPCC connector jar to the classpath on every node in the Spark cluster and to the classpath for the Spark driver, or by using the ```--jars``` option when executing spark-submit or pyspark.

Download the Spark-HPCC jar with dependencies from Maven Central: https://mvnrepository.com/artifact/org.hpccsystems/spark-hpcc

### Example of using the jars option:
```
pyspark --jars spark-hpcc-9.2.2-1-jar-with-dependencies.jar
```

### Adding Spark-HPCC jar to classpath
The Spark-HPCC jar can also be added to the classpath through various means depending on the configuration of your Spark cluster, more information about updating the classpath can be found within the Spark documentation: https://spark.apache.org/docs/latest/configuration.html

# Creating a test dataset

The following code will create a dataframe with two columns, key and fill, that will be used to demonstrate the reading and writing functionality of the Spark-HPCC connector.

---


```python
from pyspark.sql import SparkSession
import random
```


```python
data = [(i, int(1e10 * random.random())) for i in range(1000)]
df = spark.createDataFrame(data, ["key", "fill"])
df.show()
```

# Writing Data to HPCC Systems

---

A Spark Dataframe can be written to HPCC using the Spark DataSource API.
- **Mode**: This is the Spark SaveMode, the Spark-HPCC Connector supports: *[ErrorIfExists, Ignore, Overwrite]*
    - Defaults to ErrorIfExists
- **Host**: The URL of an ESP running on the target HPCC Systems cluster.
- **Username / Password**: Credentials for an HPCC Systems cluster user, can be empty or null if security isn't enabled on the target cluster.
- **Cluster**: The name of the underlying Thor cluster storage plane, this will change based on the target HPCC Systems cluster configuration, but will default to "mythor" on bare-metal and "data" on containerized systems.
- **Path**: The file path for the dataset within the HPCC Systems cluster. **Note** Spark-HPCC versions [9.2.110, 9.4.84, 9.6.36, 9.8.10] and above allows for paths to be defined with "/" path delimiter instead of the HPCC "::" delimiter this fixes URI formatting errors on Databricks.
- **Compression**: The compression algorithm to use when writing the file to the HPCC Systems cluster.
    - Options: *[default, none, lz4, flz, lzw]*



```python
df.write.save(format="hpcc",
              mode="overwrite",
              host="http://127.0.0.1:8010",
              username="",
              password="",
              cluster="mythor",
              #path="spark::test::dataset", Old path format not supported on Databricks
              path="/spark/test/dataset",
              compression="default")
```

# Reading Data from HPCC Systems

---

A dataset from within an HPCC Systems cluster can be read via the Spark Datasource API.

- **Host**: The URL of an ESP running on the target HPCC Systems cluster.
- **Username / Password**: Credentials for an HPCC Systems cluster user, can be empty or null if security isn't enabled on the target cluster.
- **Cluster**: The name of the underlying Thor cluster storage plane, this will change based on the target HPCC Systems cluster configuration, but will default to "mythor" on bare-metal and "data" on containerized systems.
- **Path**: The file path for the dataset within the HPCC Systems cluster. **Note** Spark-HPCC versions [9.2.110, 9.4.84, 9.6.36, 9.8.10] and above allows for paths to be defined with "/" path delimiter instead of the HPCC "::" delimiter this fixes URI formatting errors on Databricks.
- **limitPerFilePart**: *Optional* Limit on the number of records to be read per file part / partition within the HPCC Systems dataset.
- **recordSamplingRate**: *Optional* The percentage of records to sample from the dataset. Range: [1e-12,1.0]
- **recordSamplingSeed**: *Optional* The seed that controls the random generation used for sampling. The same seed against the same HPCC cluster and HPCC platform version should result in the same sampling.
- **projectList**: *Optional* The columns that should be read from the HPCC Systems dataset.
- **useTLK** *Optional* Defaults to false, determines whether or not the TLK (Top Level Key) should be used when reading index files.
- **fileParts** *Optional* List of file parts to read; supports a comma-separated list of files, file part ranges, or a combination of both.
- **stringProcessing** *Optional* Comma separated list of processing rules to apply to strings available rules: [NONE, TRIM, TRIM_FIXED, EMPTY_TO_NULL]. Default behavior is NONE. TRIM will apply left and right trim all strings, TRIM_FIXED will apply left trim and right trim for only fixed length strings, and EMPTY_TO_NULL will convert empty strings to a null value.
- **unsignedEightToDecimal** *Optional* By default Unsigned8 values in HPCC are read into a Java long, which will result in some values overflowing and becoming negative. If the Unsigned8 value is used a a unique identifier this is acceptable, but for cases where the numeric value is needed the Unsigned8 can be read into a Decimal value which supports the entire Unsigned8 range.

---
## Troubleshooting:
- **Empty dataset**: This typically indicates that an error occured on one or more of the worker nodes during the read process, the worker logs should contain more information about the particular failure.



```python
readDf = spark.read.load(format="hpcc",
                         host="http://127.0.0.1:8010",
                         username="",
                         password="",
                         useTLK="false",
                         cluster="mythor",
                         #path="spark::test::dataset", Old path format not supported on Databricks
                         path="/spark/test/dataset",
                         fileParts="1,2,3, 5-10, 30-40",
                         recordSamplingRate=0.1,
                         recordSamplingSeed=42,
                         limitPerFilePart=100,
                         projectList="key, fill",
                         stringProcessing="TRIM, EMPTY_TO_NULL",
                         unsignedEightToDecimal="true"
                         )
```


```python
readDf.show()
```

# OpenTelemetry Support

---

Spark-HPCC after 9.8.12 supports OpenTelemetry tracing. In order to utilize tracing with PySpark OpenTelemetry will need to be enabled and configured within your PySpark code, exporter jars will need to be added to the Spark Java class path, and finally tracing information needs to passed from Python into the Spark-HPCC APIs.

## Python Setup
The following python libraries need to be installed:
```
!pip install opentelemetry-api
!pip install opentelemetry-sdk
!pip install opentelemetry-exporter-otlp-proto-grpc
```

See: https://opentelemetry.io/docs/zero-code/python/configuration for more information on Python OpenTelemetry configuration


## Java Setup
The following jars will need to be available on the classpath in Spark:
```
opentelemetry-exporter-otlp-1.38.0.jar
opentelemetry-exporter-sender-okhttp-1.38.0.jar
```
The Java OpenTelemetry SDK is auto-configured based on environment variables. By default all tracing will be exported to logging. In order to correctly export logs to an external aggregator changing environment variables is required; See https://opentelemetry.io/docs/languages/java/configuration/ for more information on available configuration.

Example Java environment variables to configure the otlp grpc exporter:
```
'OTEL_TRACES_EXPORTER' = 'otlp'
'OTEL_LOGS_EXPORTER' = 'logging'
'OTEL_METRICS_EXPORTER' = 'logging'
'OTEL_EXPORTER_OTLP_PROTOCOL' = 'grpc'
'OTEL_EXPORTER_OTLP_ENDPOINT' = 'http://localhost:4317'
'OTEL_JAVA_GLOBAL_AUTOCONFIGURE_ENABLED' = 'true'
```

## Example PySpark Command:
```bash
pyspark \
    --jars ./spark-hpcc-9.8.12-0-jar-with-dependencies.jar,./opentelemetry-exporter-otlp-1.38.0.jar,./opentelemetry-exporter-sender-okhttp-1.38.0.jar \
    --conf "spark.driver.extraJavaOptions=-Dotel.java.global-autoconfigure.enabled=true \
    -Dotel.traces.exporter=otlp \
    -Dotel.logs.exporter=logging \
    -Dotel.metrics.exporter=logging \
    -Dotel.exporter.otlp.protocol=http/protobuf \
    -Dotel.exporter.otlp.endpoint=http://localhost:4318" \
    --conf "spark.executor.extraJavaOptions=-Dotel.java.global-autoconfigure.enabled=true \
    -Dotel.traces.exporter=otlp \
    -Dotel.logs.exporter=logging \
    -Dotel.metrics.exporter=logging \
    -Dotel.exporter.otlp.protocol=http/protobuf \
    -Dotel.exporter.otlp.endpoint=http://localhost:4318"
```

# OpenTelemetry Example

---

Spark-HPCC APIs now support the ability to pass in the OpenTelemetry TraceID & SpanID to propagate tracing.

- **traceID**: *Optional* The hexadecimal string representing the current trace.
- **spanID** *Optional* The hexadecimal string representing the current span.


```python
from pyspark.sql import SparkSession
import os

from opentelemetry import trace
from opentelemetry.sdk.trace import TracerProvider
from opentelemetry.sdk.trace.export import (
    BatchSpanProcessor,
)
from opentelemetry.exporter.otlp.proto.grpc.trace_exporter import OTLPSpanExporter

# Configure Python OpenTelemetry
# Note: this needs to be done seperately from the Java configuration
otlp_exporter = OTLPSpanExporter(
    endpoint="http://localhost:4317",
)

provider = TracerProvider()
processor = BatchSpanProcessor(otlp_exporter)
provider.add_span_processor(processor)

trace.set_tracer_provider(provider)
tracer = trace.get_tracer("spark.example.tracer")
```


```python
data = [(i, int(1e10 * random.random())) for i in range(1000)]
df = spark.createDataFrame(data, ["key", "fill"])

# Example Spark-HPCC Write with OpenTelemetry Tracing
with tracer.start_as_current_span("PySpark.WriteSpan") as writeSpan:

    # Convert trace & span IDs to hex string
    trace_id = format(writeSpan.get_span_context().trace_id, '032x')
    span_id = format(writeSpan.get_span_context().span_id, '016x')

    df.write.save(format="hpcc",
                  mode="overwrite",
                  host="http://127.0.01:8010",
                  cluster="mythor",
                  path="spark::test::dataset",
                  compression="default",
                  traceID=trace_id,
                  spanID=span_id)

# Example Spark-HPCC Read with OpenTelemetry Tracing
with tracer.start_as_current_span("PySpark.ReadSpan") as readSpan:

    # Convert trace & span IDs to hex string
    trace_id = format(readSpan.get_span_context().trace_id, '032x')
    span_id = format(readSpan.get_span_context().span_id, '016x')

    readDf = spark.read.load(format="hpcc",
                             host="http://127.0.0.1:8010",
                             cluster="mythor",
                             path="spark::test::dataset",
                             traceID=trace_id,
                             spanID=span_id)
    # Note: Spark won't read a dataset until it is used, therefore the count needs to be part of the above SparkReadSpan
    readDf.count()
```

# Parallel File Transfer Example

---

Using threads allows PySpark to launch multiple read/write jobs at the same time.
Spark handles each job independently inside the JVM, so Python threads don’t block each other. If your HPCC cluster and Spark cluster have available bandwidth and executor capacity, parallel jobs can significantly reduce total runtime—often turning three sequential 30-second transfers into one 30-second wall-clock operation.


```python
from concurrent.futures import ThreadPoolExecutor

def read_and_write(dataset_path, out_path):
    # Read from HPCC
    df = spark.read.load(
        format="hpcc",
        host="http://127.0.0.1:8010",
        cluster="mythor",
        path=dataset_path
    )
    # Write to Parquet
    df.write.mode("overwrite").parquet(out_path)


datasets = [
    ("spark::test::dataset1", "out/parq1"),
    ("spark::test::dataset2", "out/parq2"),
    ("spark::test::dataset3", "out/parq3"),
]

# Run the operations in parallel
with ThreadPoolExecutor(max_workers=3) as pool:
    futures = [pool.submit(read_and_write, ds, out) for ds, out in datasets]
    for f in futures:
        f.result()   # Wait for completion
```
