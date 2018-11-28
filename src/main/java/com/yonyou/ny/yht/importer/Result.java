package com.yonyou.ny.yht.importer;

import java.io.Serializable;

public class Result implements Serializable {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
