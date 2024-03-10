package br.com.pedrogallon.adapter.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "product")
public class Product {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID id;
    private String name;
    private String description;
    private float price;

    @OneToOne
    private Shop shop;

}
