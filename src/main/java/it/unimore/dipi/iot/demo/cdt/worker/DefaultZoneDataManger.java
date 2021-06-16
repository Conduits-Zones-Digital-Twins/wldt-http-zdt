package it.unimore.dipi.iot.demo.cdt.worker;


import it.unimore.dipi.iot.demo.cdt.exception.ConduitsDataManagerException;
import it.unimore.dipi.iot.demo.cdt.model.ConduitConfigurationParameter;
import it.unimore.dipi.iot.demo.cdt.model.ConduitDigitalTwinDescriptor;
import it.unimore.dipi.iot.demo.cdt.model.ZoneDigitalTwinDescriptor;

import java.util.Map;
import java.util.UUID;

/**
 *
 * Demo IoT Inventory Data Manager handling all data in a local cache implemented through Maps and Lists
 *
 * @author Marco Picone, Ph.D. - picone.m@gmail.com
 * @project http-iot-api-demo
 * @created 05/10/2020 - 11:48
 */
public class DefaultZoneDataManger implements IZoneDataManager {

    private ZoneDigitalTwinDescriptor zoneDigitalTwinDescriptor = null;

    public DefaultZoneDataManger() {
        this.zoneDigitalTwinDescriptor = new ZoneDigitalTwinDescriptor(UUID.randomUUID().toString(),
                ZoneDigitalTwinDescriptor.ZONE_DT_TYPE);
    }


    @Override
    public ZoneDigitalTwinDescriptor getZoneDescriptor() throws ConduitsDataManagerException {
        return zoneDigitalTwinDescriptor;
    }

    @Override
    public ZoneDigitalTwinDescriptor updateZoneDescriptor(ZoneDigitalTwinDescriptor zoneDigitalTwinDescriptor) throws ConduitsDataManagerException {

        if(zoneDigitalTwinDescriptor != null){
            this.zoneDigitalTwinDescriptor.setZoneId(zoneDigitalTwinDescriptor.getZoneId());
            this.zoneDigitalTwinDescriptor.setAssetDigitalTwinList(zoneDigitalTwinDescriptor.getAssetDigitalTwinList());
            this.zoneDigitalTwinDescriptor.setBorderRouterDigitalTwinList(zoneDigitalTwinDescriptor.getBorderRouterDigitalTwinList());
        }

        return this.zoneDigitalTwinDescriptor;
    }
}
