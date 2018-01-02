# camel-standalone-helloworld

A very simple Camel route in a standalone Java class that writes out Hello World 👋

The class `CamelDemoStartStop` shows how to manually start/stop a CamelContext.

The class `CamelDemoMainClass` shows how to use Camel's Main() class to start the CamelContext and keep it running.

This project was initialised first using:

    mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.cleverbuilder.examples -DartifactId=camel-standalone-helloworld

## To run

To run the example that manually starts and stops the Camel context:

    mvn clean package
    mvn exec:java -Dexec.mainClass=com.cleverbuilder.examples.CamelDemoStartStop

To run the example that uses Camel's Main class to keep the Camel context running:

    mvn clean package
    mvn exec:java -Dexec.mainClass=com.cleverbuilder.examples.CamelDemoMainClass

Press Ctrl+C to terminate the program at any time.

## Hack on this project

To import this project into IntelliJ IDEA:

1.  Download the project by clicking _Clone or download_ -> _Download ZIP_.
2.  Extract the ZIP to a location on your hard disk.
3.  In IntelliJ, click _File_ -> _Open Project_ and select the `pom.xml` file.
4.  When asked if you want to import as a Maven Project, click _Import as Maven Project_.
5.  When asked if you want to enable auto imports, click _Enable Auto-Import_.
