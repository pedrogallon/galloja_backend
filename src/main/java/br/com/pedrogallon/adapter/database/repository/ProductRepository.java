package br.com.pedrogallon.adapter.database.repository;

import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProductRepository {

    @Inject
    JPAStreamer jpaStreamer;


}
