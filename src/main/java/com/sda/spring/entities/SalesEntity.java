package com.sda.spring.entities;

import javax.persistence.*;

@Entity
@Table(name = "sales")
public class SalesEntity {

    @Id
    private Integer salesId;
    private String item;
    private Integer price;

    @ManyToOne
    @JoinColumn(name="itineraryId")
    private ItineraryEntity itineraryEntity;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ItineraryEntity getItineraryEntity() {
        return itineraryEntity;
    }

    public void setItineraryEntity(ItineraryEntity itineraryEntity) {
        this.itineraryEntity = itineraryEntity;
    }

}
