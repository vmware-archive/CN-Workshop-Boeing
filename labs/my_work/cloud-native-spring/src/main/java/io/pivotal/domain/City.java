package io.pivotal.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String county;

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String latitude;

    @Column
    private String longitude;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String stateCode;

    public String getCounty() {
        return county;
    }

    public long getId() {
        return id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}