package dev.alin.AutoParts.part;

import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PartRepository extends CrudRepository<@NonNull Part, @NonNull Long> {
    List<Part> findByOrderByNameAsc();

    List<Part> findByOrderByManufacturerAsc();
    List<Part> findByOrderByDescriptionAsc();

    List<Part> findByOrderByPriceAsc();
}
