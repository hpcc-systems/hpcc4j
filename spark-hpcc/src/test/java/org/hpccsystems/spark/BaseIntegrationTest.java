/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2023 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/
package org.hpccsystems.spark;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.sql.SparkSession;

class BaseIntegrationTest
{
    static SparkContext sparkContext = null;

    public File findRecentlyBuiltSparkJar()
    {
        try
        {
            URL url = BaseIntegrationTest.class.getProtectionDomain().getCodeSource().getLocation();
            Path parentPath = Paths.get(url.toURI()).getParent();

            FilenameFilter filter = new FilenameFilter()
            {
                @Override
                public boolean accept(File dir, String name)
                {
                    return name.matches("spark-hpcc.*-jar-with-dependencies\\.jar");
                }
            };

            File[] files = parentPath.toFile().listFiles(filter);
            if (files != null && files.length > 0)
            {
                // Return the mostly recently modified Spark jar. This should always be the correct jar
                // as the integration tests will run right after the build step is complete.
                File mostRecentlyModifiedFile = null;
                long lastModifiedTime = Long.MIN_VALUE;

                for (File file : files)
                {
                    long modifiedTime = file.lastModified();
                    if (modifiedTime > lastModifiedTime)
                    {
                        mostRecentlyModifiedFile = file;
                        lastModifiedTime = modifiedTime;
                    }
                }

                return mostRecentlyModifiedFile;
            }
        } catch (Exception e)
        {
            System.out.println("Error finding spark jar file with exception: " + e.getMessage());
        }

        return null;
    }

    public SparkConf getDefaultSparkConf()
    {
        File sparkJar = findRecentlyBuiltSparkJar();

        String sparkJarPath = "";
        if (sparkJar != null)
        {
            sparkJarPath = sparkJar.getAbsolutePath();
            System.out.println("Spark jar: " + sparkJarPath);
        }
        else
        {
            System.out.println("Unable to find spark jar matching pattern: spark-hpcc.*-jar-with-dependencies.jar, "
                              + "in directory [PROJECT_ROOT]/DataAccess/target/, check maven package / verify output for errors.");
        }

        String[] jars = {
            sparkJarPath
        };

        return new SparkConf()
            .setMaster("local")
            .setAppName("Spark-HPCC-Connector-Test")
            .set("spark.driver.allowMultipleContexts", "false")
            .set("spark.sql.allowMultipleContexts", "false")
            .setJars(jars);
    }

    public SparkContext getOrCreateSparkContext()
    {
        if (sparkContext != null)
        {
            return sparkContext;
        }

        return getOrCreateSparkContext(getDefaultSparkConf());
    }

    public SparkContext getOrCreateSparkContext(SparkConf conf)
    {
        if (sparkContext != null)
        {
            sparkContext.stop();
            SparkSession.clearActiveSession();
            SparkSession.clearDefaultSession();

            sparkContext = new SparkContext(conf);
        }

        return sparkContext;
    }

    public SparkSession getOrCreateSparkSession()
    {
        SparkSession spark = SparkSession
                            .builder()
                            .appName("Spark-HPCC-Connector-Test")
                            .config(getDefaultSparkConf())
                            .getOrCreate();
        return spark;
    }

    public SparkSession getOrCreateSparkSession(SparkConf conf)
    {
        SparkSession spark = SparkSession
                            .builder()
                            .appName("Spark-HPCC-Connector-Test")
                            .config(conf)
                            .getOrCreate();
        return spark;
    }

    public String getHPCCClusterURL()
    {
        return System.getProperty("hpccconn", "https://eclwatch.default:8010");
    }

    public String getHPCCClusterUser()
    {
        return System.getProperty("hpccuser", "");
    }

    public String getHPCCClusterPass()
    {
        return System.getProperty("hpccpass", "");
    }

    public String getThorCluster()
    {
        return System.getProperty("thorclustername", "data");
    }
}
