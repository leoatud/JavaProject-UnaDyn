package com.unadyn.facswebclient.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tblmaterial {
    private int id;
    private String name;
    private int type;
    private double bulkd;
    private byte dehum;
    private double sp;
    private double ssp;
    private int tdehum;
    private double k;
    private int firstTime;
    private int secondTime;
    private double firstSp;
    private double secondSp;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "TYPE")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "BULKD")
    public double getBulkd() {
        return bulkd;
    }

    public void setBulkd(double bulkd) {
        this.bulkd = bulkd;
    }

    @Basic
    @Column(name = "DEHUM")
    public byte getDehum() {
        return dehum;
    }

    public void setDehum(byte dehum) {
        this.dehum = dehum;
    }

    @Basic
    @Column(name = "SP")
    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }

    @Basic
    @Column(name = "SSP")
    public double getSsp() {
        return ssp;
    }

    public void setSsp(double ssp) {
        this.ssp = ssp;
    }

    @Basic
    @Column(name = "TDEHUM")
    public int getTdehum() {
        return tdehum;
    }

    public void setTdehum(int tdehum) {
        this.tdehum = tdehum;
    }

    @Basic
    @Column(name = "K")
    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    @Basic
    @Column(name = "FIRST_TIME")
    public int getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(int firstTime) {
        this.firstTime = firstTime;
    }

    @Basic
    @Column(name = "SECOND_TIME")
    public int getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(int secondTime) {
        this.secondTime = secondTime;
    }

    @Basic
    @Column(name = "FIRST_SP")
    public double getFirstSp() {
        return firstSp;
    }

    public void setFirstSp(double firstSp) {
        this.firstSp = firstSp;
    }

    @Basic
    @Column(name = "SECOND_SP")
    public double getSecondSp() {
        return secondSp;
    }

    public void setSecondSp(double secondSp) {
        this.secondSp = secondSp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tblmaterial that = (Tblmaterial) o;
        return id == that.id &&
                type == that.type &&
                Double.compare(that.bulkd, bulkd) == 0 &&
                dehum == that.dehum &&
                Double.compare(that.sp, sp) == 0 &&
                Double.compare(that.ssp, ssp) == 0 &&
                tdehum == that.tdehum &&
                Double.compare(that.k, k) == 0 &&
                firstTime == that.firstTime &&
                secondTime == that.secondTime &&
                Double.compare(that.firstSp, firstSp) == 0 &&
                Double.compare(that.secondSp, secondSp) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, bulkd, dehum, sp, ssp, tdehum, k, firstTime, secondTime, firstSp, secondSp);
    }
}
