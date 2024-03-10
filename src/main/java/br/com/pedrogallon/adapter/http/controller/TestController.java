package br.com.pedrogallon.adapter.http.controller;

import br.com.pedrogallon.adapter.database.entity.TestEntity;
import br.com.pedrogallon.adapter.database.repository.EntityRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/")
public class TestController {

    @Inject
    EntityRepository entityRepository;

    @GET
    @Path("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GET
    @Path("/test/{testId}")
    @Produces(MediaType.APPLICATION_JSON)
    public TestEntity test(long testId) {
        return entityRepository.findById(testId).orElse(null);
    }

    @GET
    @Path("/test/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TestEntity> test(
            @QueryParam("type") int type,
            @QueryParam("pageSize") int pageSize,
            @QueryParam("pageNumber") int pageNumber) {
        return entityRepository.findByType(type, pageSize, pageNumber);
    }

    @PATCH
    @Path("/test/{testId}")
    @Produces(MediaType.APPLICATION_JSON)
    public TestEntity updateName(long testId, String name) {
        entityRepository.updateName(testId, name);
        return entityRepository.findById(testId).orElse(null);
    }

}
