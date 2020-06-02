package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tblmodbus {
    private int dbId;
    private int componentDbId;
    private int modbusId;
    private int type;
    private String tcpAddress;
    private String rtuPort;
    private int rtuSpeed;
    private int rtuParity;

    @Id
    @Column(name = "dbId")
    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    @Basic
    @Column(name = "componentDbId")
    public int getComponentDbId() {
        return componentDbId;
    }

    public void setComponentDbId(int componentDbId) {
        this.componentDbId = componentDbId;
    }

    @Basic
    @Column(name = "modbusId")
    public int getModbusId() {
        return modbusId;
    }

    public void setModbusId(int modbusId) {
        this.modbusId = modbusId;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "TCPAddress")
    public String getTcpAddress() {
        return tcpAddress;
    }

    public void setTcpAddress(String tcpAddress) {
        this.tcpAddress = tcpAddress;
    }

    @Basic
    @Column(name = "RTUPort")
    public String getRtuPort() {
        return rtuPort;
    }

    public void setRtuPort(String rtuPort) {
        this.rtuPort = rtuPort;
    }

    @Basic
    @Column(name = "RTUSpeed")
    public int getRtuSpeed() {
        return rtuSpeed;
    }

    public void setRtuSpeed(int rtuSpeed) {
        this.rtuSpeed = rtuSpeed;
    }

    @Basic
    @Column(name = "RTUParity")
    public int getRtuParity() {
        return rtuParity;
    }

    public void setRtuParity(int rtuParity) {
        this.rtuParity = rtuParity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblmodbus tblmodbus = (Tblmodbus) o;
        return dbId == tblmodbus.dbId &&
                componentDbId == tblmodbus.componentDbId &&
                modbusId == tblmodbus.modbusId &&
                type == tblmodbus.type &&
                rtuSpeed == tblmodbus.rtuSpeed &&
                rtuParity == tblmodbus.rtuParity &&
                Objects.equals(tcpAddress, tblmodbus.tcpAddress) &&
                Objects.equals(rtuPort, tblmodbus.rtuPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, componentDbId, modbusId, type, tcpAddress, rtuPort, rtuSpeed, rtuParity);
    }
}
