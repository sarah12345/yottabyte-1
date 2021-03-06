package com.thoughtworks.yottabyte.vehiclecount.domainmodels;

import com.thoughtworks.yottabyte.datamodels.VehicleData;
import org.joda.time.DateTime;
import org.joda.time.Years;

public class Vehicle {
  private VehicleData vehicleData;

  public Vehicle(VehicleData vehicleData) {
    this.vehicleData = vehicleData;
  }

  public String getType() {
    return vehicleData.getType();
  }

  public String toStringRepresentation(String separator){
    return vehicleData.toStringRepresentation(separator);
  }

  public String getRegistrationNumber() {
    return vehicleData.getRegistrationNumber();
  }
}
