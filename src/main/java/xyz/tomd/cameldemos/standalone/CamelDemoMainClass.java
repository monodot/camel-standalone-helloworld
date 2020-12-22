package xyz.tomd.cameldemos.standalone;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

/**
 * Hello world! - using Camel's Main class
 *
 */
public class CamelDemoMainClass {

    public static void main( String[] args ) throws Exception {
        // Create a new instance of Camel's Main class
        Main camelMain = new Main();

        // Create a new RouteBuilder object to hold our Camel routes
        RouteBuilder routeBuilder = new RouteBuilder() {
            public void configure() {
                from("timer://foo?period=5000")  // Trigger every 5 seconds
                        .setBody().simple("Hello, world!") // Change the Exchange Body to Hello world
                        .to("log:mylogger"); // Use the Log component to write out the contents of the Exchange
            }
        };

        camelMain.configure().addRoutesBuilder(routeBuilder);
        camelMain.configure().setDurationMaxSeconds(30); // Shut down after 30 seconds

        // Start the CamelContext
        // The Camel route will keep running, until terminated using Ctrl+C
        camelMain.run();
    }

}
