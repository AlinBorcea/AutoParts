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
        ArrayList<Part> list = new ArrayList<>();
        for (Part t : repository.findAll()) {
            list.add(t);
        }

        switch (propertyId) {
            case 1 -> list.sort(Comparator.comparing(Part::getName));
            case 2 -> list.sort(Comparator.comparing(Part::getManufacturer));
            case 3 -> list.sort(Comparator.comparing(Part::getDescription));
            case 4 -> list.sort(Comparator.comparing(Part::getPrice));
        }

        return list;
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
