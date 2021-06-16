package it.unimore.dipi.iot.demo.cdt.worker;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class ZoneHttpServiceConfig extends Configuration {

    @JsonProperty("swagger")
    public SwaggerBundleConfiguration swaggerBundleConfiguration;

    private IZoneDataManager zoneDataManager = null;

    public IZoneDataManager getZoneDataManager(){

        if(this.zoneDataManager == null)
            this.zoneDataManager = new DefaultZoneDataManger();

        return this.zoneDataManager;
    }
}