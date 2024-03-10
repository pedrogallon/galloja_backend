package br.com.pedrogallon.adapter.database.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "test")
public class TestEntity {

    @Id
    private int id;

    @Basic
    private int type;

    @Basic
    private String description;
}
