package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tblcontrollers {
    private long dbId;
    private byte generation;
    private String neuronId;
    private double softwareVersion;
    private byte softwareConfiguration;
    private byte hardwareType;
    private boolean installed;
    private boolean commChecksEnabled;

    @Id
    @Column(name = "dbId")
    public long getDbId() {
        return dbId;
    }

    public void setDbId(long dbId) {
        this.dbId = dbId;
    }

    @Basic
    @Column(name = "generation")
    public byte getGeneration() {
        return generation;
    }

    public void setGeneration(byte generation) {
        this.generation = generation;
    }

    @Basic
    @Column(name = "neuronId")
    public String getNeuronId() {
        return neuronId;
    }

    public void setNeuronId(String neuronId) {
        this.neuronId = neuronId;
    }

    @Basic
    @Column(name = "softwareVersion")
    public double getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(double softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Basic
    @Column(name = "softwareConfiguration")
    public byte getSoftwareConfiguration() {
        return softwareConfiguration;
    }

    public void setSoftwareConfiguration(byte softwareConfiguration) {
        this.softwareConfiguration = softwareConfiguration;
    }

    @Basic
    @Column(name = "hardwareType")
    public byte getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(byte hardwareType) {
        this.hardwareType = hardwareType;
    }

    @Basic
    @Column(name = "installed")
    public boolean isInstalled() {
        return installed;
    }

    public void setInstalled(boolean installed) {
        this.installed = installed;
    }

    @Basic
    @Column(name = "commChecksEnabled")
    public boolean isCommChecksEnabled() {
        return commChecksEnabled;
    }

    public void setCommChecksEnabled(boolean commChecksEnabled) {
        this.commChecksEnabled = commChecksEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblcontrollers that = (Tblcontrollers) o;
        return dbId == that.dbId &&
                generation == that.generation &&
                Double.compare(that.softwareVersion, softwareVersion) == 0 &&
                softwareConfiguration == that.softwareConfiguration &&
                hardwareType == that.hardwareType &&
                installed == that.installed &&
                commChecksEnabled == that.commChecksEnabled &&
                Objects.equals(neuronId, that.neuronId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, generation, neuronId, softwareVersion, softwareConfiguration, hardwareType, installed, commChecksEnabled);
    }
}
