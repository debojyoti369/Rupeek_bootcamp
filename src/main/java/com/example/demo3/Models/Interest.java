package com.example.demo3.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jdk.jfr.DataAmount;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="interests")
public class Interest {
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String interestName;
    private List<Event> events;

    public long getId() {
        return id;
    }

    public Interest(long id, String interestName, List<Event> events) {
        this.id = id;
        this.interestName = interestName;
        this.events = events;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInterestName() {
        return interestName;
    }

    public void setInterestName(String interestName) {
        this.interestName = interestName;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}