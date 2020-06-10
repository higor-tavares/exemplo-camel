package com.higortavares.exemplocamel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PostRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:exemplo?repeatCount=1")
                .log("Começou!")
                .end();
    }
}
