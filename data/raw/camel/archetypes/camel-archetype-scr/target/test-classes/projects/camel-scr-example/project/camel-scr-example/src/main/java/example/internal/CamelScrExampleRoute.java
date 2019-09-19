package example.internal;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.SimpleRegistry;
import org.apache.camel.scr.AbstractCamelRunner;

public class CamelScrExampleRoute extends RouteBuilder {

    // Configured fields
    private String camelRouteId;

    @Override
	public void configure() throws Exception {
        // Add a bean to Camel context registry
        AbstractCamelRunner.getRegistry(getContext(), SimpleRegistry.class).put("testString", "this is a test");

        from("{{from}}").routeId(camelRouteId)
            .to("{{to}}");
	}

}
