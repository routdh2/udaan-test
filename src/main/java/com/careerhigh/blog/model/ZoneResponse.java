package com.careerhigh.blog.model;

public class ZoneResponse {

    private int numCases;
    private ZoneType zoneType;

    public ZoneResponse(int numCases, ZoneType zoneType) {
        this.numCases = numCases;
        this.zoneType = zoneType;
    }

    public int getNumCases() {
        return numCases;
    }

    public void setNumCases(int numCases) {
        this.numCases = numCases;
    }

    public ZoneType getZoneType() {
        return zoneType;
    }

    public void setZoneType(ZoneType zoneType) {
        this.zoneType = zoneType;
    }
}
