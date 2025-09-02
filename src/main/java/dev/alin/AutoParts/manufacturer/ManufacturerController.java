package dev.alin.AutoParts.manufacturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManufacturerController {
    @Autowired
    private ManufacturerService manufacturerService;

    @RequestMapping("/manufacturers")
    public List<Manufacturer> getManufacturer() {
        return manufacturerService.getAll();
    }
}
