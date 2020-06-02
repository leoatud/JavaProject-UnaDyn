package com.unadyn.facswebclient.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tbltrial {
    private int value;

    @Id
    @Column(name = "VALUE")
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tbltrial tbltrial = (Tbltrial) o;
        return value == tbltrial.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
