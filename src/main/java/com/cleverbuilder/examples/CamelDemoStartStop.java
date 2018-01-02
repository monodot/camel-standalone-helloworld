package com.cleverbuilder.examples;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;

/**
 * Hello world! - using manual start/stop of the Camel context
 *
 */
public class CamelDemoStartStop {

    public static void main( String[] args ) throws Exception {
        CamelContext context = new DefaultCamelContext();

        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("timer://foo?period=5000")  // Create a message every 5 seconds
                        .setBody().simple("Hello, world!")
                        .to("log:mylogger");
            }
        });

        context.start(); // start the route
        Thread.sleep(30000L); // let the route run for 30 seconds
        context.stop(); // stop the route
    }
}
