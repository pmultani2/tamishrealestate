package com.tamishre.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "featured")
public class Featured {
    @Id
    @Column(name = "ml_num", nullable = false, length = Integer.MAX_VALUE)
    private String mlNum;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ml_num", nullable = false)
    private Property property;

    public String getMlNum() {
        return mlNum;
    }

    public void setMlNum(String mlNum) {
        this.mlNum = mlNum;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

}