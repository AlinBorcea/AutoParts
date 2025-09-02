package dev.alin.AutoParts.part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class PartService {

    @Autowired
    private PartRepository repository;

    public List<Part> getAllParts() {
        var list = new ArrayList<Part>();
        for (Part t : repository.findAll()) {
            list.add(t);
        }
        return list;
    }

    public List<Part> getAllPartsByProperty(int propertyId) {
        return switch (propertyId) {
            case 1 -> repository.findByOrderByNameAsc();
            case 2 -> repository.findByOrderByManufacturerAsc();
            case 3 -> repository.findByOrderByDescriptionAsc();
            case 4 -> repository.findByOrderByPriceAsc();
            default -> new ArrayList<>();
        };
    }

    public boolean isDBEmpty() {
        return !repository.findAll().iterator().hasNext();
    }
}
