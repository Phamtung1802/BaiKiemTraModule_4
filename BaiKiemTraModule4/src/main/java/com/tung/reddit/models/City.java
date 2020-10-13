package com.tung.reddit.models;

import com.tung.reddit.models.Country;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cuties")
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @Min(0)
    private double area;
    @Min(0)
    private long population;
    @Min(0)
    private double gdp;
    @Column(columnDefinition = "text")
    private String description;
}