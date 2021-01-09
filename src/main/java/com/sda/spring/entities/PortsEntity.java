package com.sda.spring.entities;

import javax.persistence.*;

@Entity
@Table(name = "ports")
public class PortsEntity {
    @Id
    private Integer portId;
    @Column(length = 100)
    private String portname;

    @ManyToOne
    @JoinColumn(name = "itineraryId")
    private ItineraryEntity itineraryEntity;

    public String getPortname() {
        return portname;
    }

    public void setPortname(String portname) {
        this.portname = portname;
    }

    public Integer getPortId() {
        return portId;
    }

    public void setPortId(Integer portId) {
        this.portId = portId;
    }
}
