package it.unimore.dipi.iot.demo.cdt.worker;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.eclipse.jetty.servlets.CrossOriginFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.EnumSet;

public class ZoneHttpService extends Application<ZoneHttpServiceConfig> {

    public void run(ZoneHttpServiceConfig appConfig, Environment environment) throws Exception {

        //CZM RESOURCES
        environment.jersey().register(new ZoneResource(appConfig));

        // Enable CORS headers
        final FilterRegistration.Dynamic cors = environment.servlets().addFilter("CORS", CrossOriginFilter.class);

        // Configure CORS parameters
        cors.setInitParameter("allowedOrigins", "*");
        cors.setInitParameter("allowedHeaders", "X-Requested-With,Content-Type,Accept,Origin");
        cors.setInitParameter("allowedMethods", "OPTIONS,GET,PUT,POST,DELETE,HEAD");

        // Add URL mapping
        cors.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

    }

    @Override
    public void initialize(Bootstrap<ZoneHttpServiceConfig> bootstrap) {

        bootstrap.addBundle(new SwaggerBundle<ZoneHttpServiceConfig>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(ZoneHttpServiceConfig configuration) {
                return configuration.swaggerBundleConfiguration;
            }
        });

    }
}