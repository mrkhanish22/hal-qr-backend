package com.hal.hal.dto;

public class ComponentRequest {

    private String partNumber;
    private String serialNumber;
    private String batchNumber;
    private String manufacturingType;
    private String expiry;

    public String getPartNumber() {
        return partNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public String getManufacturingType() {
        return manufacturingType;
    }

    public String getExpiry() {
        return expiry;
    }
}