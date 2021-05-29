package org.sswamyn.reactiveboot.domain;

import javax.persistence.*;

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


    private int creditLimit;

    public Agent(){}
    public Agent(String networkID, String agtType, String agtStatus, int commissionLevel, int creditLimit) {
        //this.id = id;
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
