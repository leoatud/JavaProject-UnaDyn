package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tblcurrentrecipe {
    private int dbId;
    private int deviceDbId;
    private int recipeDbId;

    @Id
    @Column(name = "dbId")
    public int getDbId() {
        return dbId;
    }

    public void setDbId(int dbId) {
        this.dbId = dbId;
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
    @Column(name = "recipeDbId")
    public int getRecipeDbId() {
        return recipeDbId;
    }

    public void setRecipeDbId(int recipeDbId) {
        this.recipeDbId = recipeDbId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblcurrentrecipe that = (Tblcurrentrecipe) o;
        return dbId == that.dbId &&
                deviceDbId == that.deviceDbId &&
                recipeDbId == that.recipeDbId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbId, deviceDbId, recipeDbId);
    }
}
