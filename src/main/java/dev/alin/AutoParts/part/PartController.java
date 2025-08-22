package dev.alin.AutoParts.part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartController {

    @Autowired
    private PartService service;

    @RequestMapping("/allParts")
    public List<Part> getAllParts() {
        return service.getAllParts();
    }

}
