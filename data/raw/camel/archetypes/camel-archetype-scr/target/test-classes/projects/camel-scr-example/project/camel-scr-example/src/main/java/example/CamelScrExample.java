package example;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.scr.AbstractCamelRunner;
import example.internal.CamelScrExampleRoute;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.spi.ComponentResolver;
import org.apache.felix.scr.annotations.*;
import org.osgi.framework.BundleContext;

@Component(label = CamelScrExample.COMPONENT_LABEL, description = CamelScrExample.COMPONENT_DESCRIPTION, immediate = true, metatype = true)
@Properties({
    @Property(name = "camelContextId", value = "camel-scr-example"),
    @Property(name = "camelRouteId", value = "foo"),
    @Property(name = "active", value = "true"),
    @Property(name = "from", value = "timer:foo?period=5000"),
    @Property(name = "to", value = "log:foo")
})
@References({
    @Reference(name = "camelComponent",referenceInterface = ComponentResolver.class,
        cardinality = ReferenceCardinality.MANDATORY_MULTIPLE, policy = ReferencePolicy.DYNAMIC,
        policyOption = ReferencePolicyOption.GREEDY, bind = "gotCamelComponent", unbind = "lostCamelComponent")
})
public class CamelScrExample extends AbstractCamelRunner {

    public static final String COMPONENT_LABEL = "example.CamelScrExample";
    public static final String COMPONENT_DESCRIPTION = "This is the description for camel-scr-example.";

    @Override
    protected List<RoutesBuilder> getRouteBuilders() {
        List<RoutesBuilder> routesBuilders = new ArrayList<>();
        routesBuilders.add(new CamelScrExampleRoute());
        return routesBuilders;
    }

    @Override
    protected void setupCamelContext(BundleContext bundleContext, String camelContextId)throws Exception{
        super.setupCamelContext(bundleContext, camelContextId);

        // Use MDC logging
        getContext().setUseMDCLogging(true);

        // Use breadcrumb logging
        getContext().setUseBreadcrumb(true);
    }
}
