package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tblhostedcomponentassignments {
    private long dbId;
    private long hostingComponentDbId;
    private long hostedComponentDbId;
    private byte localStorageId;

    @Id
    @Column(name = "dbId")
    public long getDbId() {
        return dbId;
    }

    public void setDbId(long dbId) {
        this.dbId = dbId;
    }

    @Basic
    @Column(name = "hostingComponentDbId")
    public long getHostingComponentDbId() {
        return hostingComponentDbId;
    }

    public void setHostingComponentDbId(long hostingComponentDbId) {
        this.hostingComponentDbId = hostingComponentDbId;
    }

    @Basic
    @Column(name = "hostedComponentDbId")
    public long getHostedComponentDbId() {
        return hostedComponentDbId;
    }

    public void setHostedComponentDbId(long hostedComponentDbId) {
        this.hostedComponentDbId = hostedComponentDbId;
    }

    @Basic
    @Column(name = "localStorageId")
    public byte getLocalStorageId() {
        return localStorageId;
    }

    public void setLocalStorageId(byte localStorageId) {
        this.localStorageId = localStorageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblhostedcomponentassignments that = (Tblhostedcomponentassignments) o;
        return dbId == that.dbId &&
                hostingComponentDbId == that.hostingComponentDbId &&
                hostedComponentDbId == that.hostedComponentDbId &&
                localStorageId == that.localStorageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, hostingComponentDbId, hostedComponentDbId, localStorageId);
    }
}
