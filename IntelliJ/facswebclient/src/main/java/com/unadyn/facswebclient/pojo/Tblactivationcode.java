package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tblactivationcode {
    private int dbId;
    private String activationCode;

    @Id
    @Column(name = "dbId")
    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
    }

    @Basic
    @Column(name = "activationCode")
    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblactivationcode that = (Tblactivationcode) o;
        return dbId == that.dbId &&
                Objects.equals(activationCode, that.activationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, activationCode);
    }
}
