// camel-k: language=java

import org.apache.camel.builder.RouteBuilder;

public class FileRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Write your routes here, for example:
        from("file:/tmp/inbox")
                        .to("file:/tmp/delivery");
    }
}
