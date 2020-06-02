package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Tblblenderjob {
    private int dbId;
    private String name;
    private String recipeName;
    private int deviceDbId;
    private String description;
    private Timestamp tsstart;
    private Timestamp tsend;
    private int status;

    @Id
    @Column(name = "dbId")
    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "recipeName")
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    @Basic
    @Column(name = "deviceDbId")
    public int getDeviceDbId() {
        return deviceDbId;
    }

    public void setDeviceDbId(int deviceDbId) {
        this.deviceDbId = deviceDbId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "tsstart")
    public Timestamp getTsstart() {
        return tsstart;
    }

    public void setTsstart(Timestamp tsstart) {
        this.tsstart = tsstart;
    }

    @Basic
    @Column(name = "tsend")
    public Timestamp getTsend() {
        return tsend;
    }

    public void setTsend(Timestamp tsend) {
        this.tsend = tsend;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblblenderjob that = (Tblblenderjob) o;
        return dbId == that.dbId &&
                deviceDbId == that.deviceDbId &&
                status == that.status &&
                Objects.equals(name, that.name) &&
                Objects.equals(recipeName, that.recipeName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(tsstart, that.tsstart) &&
                Objects.equals(tsend, that.tsend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, name, recipeName, deviceDbId, description, tsstart, tsend, status);
    }
}
