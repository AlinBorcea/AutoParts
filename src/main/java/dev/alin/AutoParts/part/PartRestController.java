package dev.alin.AutoParts.part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartRestController {

    @Autowired
    private PartService service;

    @RequestMapping("/allParts")
    public List<Part> getAllParts() {
        return service.getAllParts();
    }

    @RequestMapping("allParts/by/{propertyId}")
    public List<Part> getAllParts1(@PathVariable int propertyId) {
        return service.getAllPartsByProperty(propertyId);
    }

}
