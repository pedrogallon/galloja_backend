package br.com.pedrogallon.adapter.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "shop")
public class Shop {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private UUID id;
    private String name;
    private String description;
    private String cnpj;

    @OneToMany(mappedBy = "shop")
    private List<Product> products;

}
