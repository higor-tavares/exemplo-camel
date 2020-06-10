package com.higortavares.exemplocamel.route;

import com.higortavares.exemplocamel.model.Post;
import com.higortavares.exemplocamel.service.PostService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.component.jackson.ListJacksonDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostRoute extends RouteBuilder {
    @Autowired
    PostService postService;
    @Override
    public void configure() throws Exception {
        JacksonDataFormat format = new ListJacksonDataFormat(Post.class);

        from("timer:exemplo?repeatCount=1")
                .to("https://jsonplaceholder.typicode.com/posts")
                .unmarshal(format)
                .split(body())
                .process(exchange -> {
                    Post post = exchange.getIn().getBody(Post.class);
                    postService.save(post);
                })
                .log("${body}")
                .end();
    }
}
