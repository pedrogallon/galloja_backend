package br.com.pedrogallon.adapter.database.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "user")
public class User {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID id;

    private String name;
    private String email;

}
