package dev.alin.AutoParts.part;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PartRepository extends CrudRepository<Part, Long> {
    public List<Part> findAllByOrderByName();
}
