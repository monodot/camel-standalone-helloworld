# camel-standalone-helloworld

A very simple Camel route in a standalone Java class that writes out Hello World 👋

The class `CamelDemoMainClass` shows how to use Camel's `Main` class to start the CamelContext and keep it running for 30 seconds.

        -DgroupId=xyz.tomd.cameldemos \ 
        -DartifactId=camel-standalone-helloworld

## To run

To run the example:

    mvn clean package
    mvn exec:java -Dexec.mainClass=xyz.tomd.cameldemos.standalone.CamelDemoMainClass

Press Ctrl+C to terminate the program at any time.

## Hack on this project

To import this project into IntelliJ IDEA:

1.  Download the project by clicking _Clone or download_ -> _Download ZIP_.

2.  Extract the ZIP to a location on your hard disk.

3.  In IntelliJ, click _File_ -> _Open Project_ and select the `pom.xml` file.

4.  When asked if you want to import as a Maven Project, click _Import as Maven Project_.

5.  When asked if you want to enable auto imports, click _Enable Auto-Import_.
