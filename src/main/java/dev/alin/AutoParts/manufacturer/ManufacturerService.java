package dev.alin.AutoParts.manufacturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public List<Manufacturer> getAll() {
        var manufacturers = new ArrayList<Manufacturer>();
        var it = manufacturerRepository.findAll();
        for (var manufacturer : it) {
            manufacturers.add(manufacturer);
        }

        return manufacturers;
    }
}