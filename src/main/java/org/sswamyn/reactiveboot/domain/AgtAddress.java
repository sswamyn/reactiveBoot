package org.sswamyn.reactiveboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AgtAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressId;
    private String addressLine1, addressLine2, addressLine3, addressCity, addressProvince, addressCountry, addressPostalcode;
    public AgtAddress() {}

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressPostalcode() {
        return addressPostalcode;
    }

    public void setAddressPostalcode(String addressPostalcode) {
        this.addressPostalcode = addressPostalcode;
    }

    public AgtAddress(String addressLine1, String addressLine2, String addressLine3, String addressCity,
                      String addressProvince, String addressCountry, String addressPostalcode){
        super();
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressCity  = addressCity;
        this.addressProvince = addressProvince;
        this.addressCountry = addressCountry;
        this.addressPostalcode = addressPostalcode;
    }


}
