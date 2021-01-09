package com.sda.spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ships")
public class ShipsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer shipId;
    private String name;
    private Integer capacity;
    private String itinerary;
    private Integer cruiselength;

    @OneToMany(mappedBy = "shipsEntity")
    private List<ItineraryEntity> itineraryEntity;

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }

    public Integer getCruiselength() {
        return cruiselength;
    }

    public void setCruiselength(Integer cruiselength) {
        this.cruiselength = cruiselength;
    }

    public List<ItineraryEntity> getItineraryEntity() {
        return itineraryEntity;
    }

    public void setItineraryEntity(List<ItineraryEntity> itineraryEntity) {
        this.itineraryEntity = itineraryEntity;
    }
}
