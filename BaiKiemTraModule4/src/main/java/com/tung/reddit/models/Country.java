package com.tung.reddit.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
}