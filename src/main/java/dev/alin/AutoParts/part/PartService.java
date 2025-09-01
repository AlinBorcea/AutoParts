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

    public void populateInMemoryDB() {
        List<Part> parts = Arrays.asList(new Part(0, "Turbo3X", "Fosch", "Booster", 970),
                new Part(1, "Ventilator", "Breeze Co", "Freezes", 721),
                new Part(2, "Oil Pump", "Dacie", "Pumps", 370),
                new Part(3, "Inter Cooler", "Deutsch", "Cools", 470),
                new Part(4, "WD40", "America", "Lubricates", 270));

        repository.saveAll(parts);
    }

}
