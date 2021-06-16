package it.unimore.dipi.iot.demo.cdt.worker;

import it.unimore.dipi.iot.demo.cdt.exception.ConduitsDataManagerException;
import it.unimore.dipi.iot.demo.cdt.model.ConduitDigitalTwinDescriptor;
import it.unimore.dipi.iot.demo.cdt.model.ZoneDigitalTwinDescriptor;

import java.util.Map;

/**
 * @author Marco Picone, Ph.D. - picone.m@gmail.com
 * @project http-iot-api-demo
 * @created 05/10/2020 - 11:44
 */
public interface IZoneDataManager {

    public ZoneDigitalTwinDescriptor getZoneDescriptor() throws ConduitsDataManagerException;

    public ZoneDigitalTwinDescriptor updateZoneDescriptor(ZoneDigitalTwinDescriptor zoneDigitalTwinDescriptor) throws ConduitsDataManagerException;
}
