package dev.alin.AutoParts.manufacturer;

import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<@NonNull Manufacturer, @NonNull Long> {
}
