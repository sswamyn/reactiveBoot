package org.sswamyn.reactiveboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Agent {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="networkID", nullable=false, length=20)
    private String networkID;
    @Column(name="agtType", nullable=false, length=20)
    private String agtType;
    @Column(name="agtStatus", nullable=false, length=4)
    private String agtStatus;
    @Column(name="commissionLevel")
    private int commissionLevel;
    @Column(name="creditLimit")
    private int creditLimit;

    //Forgien key relationship
    @OneToMany(cascade = CascadeType.ALL, mappedBy="agent")
    @JsonIgnore
    private List<AgtAddress> agtAddress;

    public List<AgtAddress> getAgtAddressList() {
        return agtAddress;
    }

    public void setAgtAddressList(List<AgtAddress> agtAddress) {
        this.agtAddress = agtAddress;
    }
    // Construtors
    public Agent(){}
    //public Agent(long id, String networkID, String agtType, String agtStatus, int commissionLevel, int creditLimit) {
    public Agent(String networkID, String agtType, String agtStatus, int commissionLevel, int creditLimit) {
        super();
        this.networkID = networkID;
        this.agtType = agtType;
        this.agtStatus = agtStatus;
        this.commissionLevel = commissionLevel;
        this.creditLimit = creditLimit;
    }

    public long getId() {
        return id;
    }

    public String getNetworkID() {
        return networkID;
    }

    public String getAgtType() {
        return agtType;
    }

    public String getAgtStatus() {
        return agtStatus;
    }

    public int getCommissionLevel() {
        return commissionLevel;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    public void setAgtType(String agtType) {
        this.agtType = agtType;
    }

    public void setAgtStatus(String agtStatus) {
        this.agtStatus = agtStatus;
    }

    public void setCommissionLevel(int commissionLevel) {
        this.commissionLevel = commissionLevel;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}
