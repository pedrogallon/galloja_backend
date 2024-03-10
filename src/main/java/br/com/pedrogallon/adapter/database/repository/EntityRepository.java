package br.com.pedrogallon.adapter.database.repository;

import br.com.pedrogallon.adapter.database.entity.TestEntity;
import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class EntityRepository {

    @Inject
    JPAStreamer jpaStreamer;

    public Optional<TestEntity> findById(long id) {
        return jpaStreamer.stream(TestEntity.class)
                .filter(testEntity -> testEntity.getId() == id)
                .findFirst();
    }

    public List<TestEntity> findByType(int type, int pageSize, int pageNumber) {
        return jpaStreamer.stream(TestEntity.class)
                .filter(testEntity -> testEntity.getType() == type)
                .skip(pageSize * pageNumber)
                .limit(pageSize)
                .toList();
    }

    @Transactional
    public void updateName(long id, String name) {
        jpaStreamer.stream(TestEntity.class)
                .filter(testEntity -> testEntity.getId() == id)
                .findFirst()
                .ifPresent(testEntity -> testEntity.setDescription(name));
    }
}
