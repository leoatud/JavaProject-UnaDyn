package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tblcomponents {
    private long dbId;
    private short facs2ComponentType;
    private short typeId;
    private String name;

    @Id
    @Column(name = "dbId")
    public long getDbId() {
        return dbId;
    }

    public void setDbId(long dbId) {
        this.dbId = dbId;
    }

    @Basic
    @Column(name = "facs2ComponentType")
    public short getFacs2ComponentType() {
        return facs2ComponentType;
    }

    public void setFacs2ComponentType(short facs2ComponentType) {
        this.facs2ComponentType = facs2ComponentType;
    }

    @Basic
    @Column(name = "typeId")
    public short getTypeId() {
        return typeId;
    }

    public void setTypeId(short typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblcomponents that = (Tblcomponents) o;
        return dbId == that.dbId &&
                facs2ComponentType == that.facs2ComponentType &&
                typeId == that.typeId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, facs2ComponentType, typeId, name);
    }
}
