package com.sda.spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "itinerary")
public class ItineraryEntity {
    @Id
    private Integer itineraryId;
    @Column(length = 100)
    private String itinerary_name;
    private Integer days;
    private Integer daysAtSea;
    private Integer portDays;

    @ManyToOne
    @JoinColumn(name = "shipId")
    private ShipsEntity shipsEntity;

    @OneToMany(mappedBy = "itineraryEntity")
    private List<PortsEntity> portsEntities;


    @OneToMany(mappedBy = "itineraryEntity")
    private List<SalesEntity> salesEntities;

    public String getItinerary_name() {
        return itinerary_name;
    }

    public void setItinerary_name(String name) {
        this.itinerary_name = name;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getDaysAtSea() {
        return daysAtSea;
    }

    public void setDaysAtSea(Integer daysAtSea) {
        this.daysAtSea = daysAtSea;
    }

    public Integer getPortDays() {
        return portDays;
    }

    public void setPortDays(Integer portDays) {
        this.portDays = portDays;
    }

    public ShipsEntity getShipsEntity() {
        return shipsEntity;
    }

    public void setShipsEntity(ShipsEntity shipsEntity) {
        this.shipsEntity = shipsEntity;
    }

    public List<PortsEntity> getPortsEntities() {
        return portsEntities;
    }

    public void setPortsEntities(List<PortsEntity> portsEntities) {
        this.portsEntities = portsEntities;
    }

    public List<SalesEntity> getSalesEntities() {
        return salesEntities;
    }

    public void setSalesEntities(List<SalesEntity> salesEntities) {
        this.salesEntities = salesEntities;
    }

    public Integer getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(Integer itineraryId) {
        this.itineraryId = itineraryId;
    }
}
