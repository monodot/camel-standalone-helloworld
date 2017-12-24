package com.cleverbuilder.examples;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;

/**
 * Hello world!
 *
 */
public class CamelApp {

    public static void main( String[] args ) throws Exception {

        RouteBuilder routeBuilder = new RouteBuilder() {
            public void configure() {
                from("timer://foo?period=5000")  // Create a message every 5 seconds
                        .setBody().simple("Hello, world!")
                        .to("log:mylogger");
            }
        };

        // Create a new instance of Camel's Main class
        Main main = new Main();
        // Add the route we defined above
        main.addRouteBuilder(routeBuilder);

        // Start the CamelContext
        // The Camel route will keep running, until terminated using Ctrl+C
        main.run();

    }

}
