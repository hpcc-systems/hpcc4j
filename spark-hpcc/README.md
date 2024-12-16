[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/spark-hpcc/badge.svg?subject=spark-hpcc)](https://maven-badges.herokuapp.com/maven-central/org.hpccsystems/spark-hpcc)

<table>
  <thead>
    <tr>
      <td align="left">
        :zap: <b>Note:</b> This project references log4j which has been reported to include security vulnerabilitie(s) in versions prior to v2.15.0
      </td>
    </tr>
  </thead>

  <tbody>
    <tr>
      <td>
        <ul>
          <li>The Spark-HPCC project no longer references the offending log4j versions</li>
          <li>Users of Spark-HPCC are strongly encouraged to update to the latest version</li>
          <li>Learn more about the vulnerabiltiy: https://github.com/advisories/GHSA-jfh8-c2jp-5v3q</li>
        </ul>
      </td>
    </tr>
  </tbody>
</table>

# Spark-HPCC
Spark classes for HPCC Systems / Spark interoperability

### DataAccess
The DataAccess project contains the classes which expose distributed
streaming of HPCC based data via Spark constructs. In addition,
the HPCC data is exposed as a Dataframe for the convenience of the Spark developer.

### Dependencies
The spark-hpcc target jar does not package any of the Spark libraries it depends on.
If using a standard Spark submission pipeline such as spark-submit these dependencies will be provided as part of the Spark installation.
However, if your pipeline executes a jar directly you may need to add the Spark libraries from your $SPARK_HOME to the classpath.

### Examples & Documentation
See: [Examples](https://github.com/hpcc-systems/Spark-HPCC/tree/master/Examples) for example usage of the connector as well as API documentation for the reading and writing APIs.

## Please note:
##### As reported by github:

"In all versions of Apache Spark, its standalone resource manager accepts code to execute on a 'master' host, that then runs that code on 'worker' hosts. The master itself does not, by design, execute user code. A specially-crafted request to the master can, however, cause the master to execute code too. Note that this does not affect standalone clusters with authentication enabled. While the master host typically has less outbound access to other resources than a worker, the execution of code on the master is nevertheless unexpected.
Mitigation

Enable authentication on any Spark standalone cluster that is not otherwise secured from unwanted access, for example by network-level restrictions. Use spark.authenticate and related security properties described at https://spark.apache.org/docs/latest/security.html"

