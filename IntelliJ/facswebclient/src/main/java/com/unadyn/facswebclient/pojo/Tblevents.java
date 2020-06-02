package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Tblevents {
    private long eventId;
    private int eventType;
    private Timestamp ts;
    private Long machineDbId;
    private String machineName;
    private String base;
    private String data;
    private String user;
    private String code;
    private Byte alarmSeverity;

    @Id
    @Column(name = "eventId")
    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "eventType")
    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "ts")
    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    @Basic
    @Column(name = "machineDbId")
    public Long getMachineDbId() {
        return machineDbId;
    }

    public void setMachineDbId(Long machineDbId) {
        this.machineDbId = machineDbId;
    }

    @Basic
    @Column(name = "machineName")
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Basic
    @Column(name = "base")
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Basic
    @Column(name = "data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Basic
    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "alarmSeverity")
    public Byte getAlarmSeverity() {
        return alarmSeverity;
    }

    public void setAlarmSeverity(Byte alarmSeverity) {
        this.alarmSeverity = alarmSeverity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblevents tblevents = (Tblevents) o;
        return eventId == tblevents.eventId &&
                eventType == tblevents.eventType &&
                Objects.equals(ts, tblevents.ts) &&
                Objects.equals(machineDbId, tblevents.machineDbId) &&
                Objects.equals(machineName, tblevents.machineName) &&
                Objects.equals(base, tblevents.base) &&
                Objects.equals(data, tblevents.data) &&
                Objects.equals(user, tblevents.user) &&
                Objects.equals(code, tblevents.code) &&
                Objects.equals(alarmSeverity, tblevents.alarmSeverity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventType, ts, machineDbId, machineName, base, data, user, code, alarmSeverity);
    }
}
