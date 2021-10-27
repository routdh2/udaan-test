package com.careerhigh.blog.model;

public class CovidResponse {

    private boolean updated;

    public CovidResponse(boolean updated) {
        this.updated = updated;
    }

    public boolean isUpdated() {
        return updated;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }
}
