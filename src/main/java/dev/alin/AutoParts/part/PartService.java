package dev.alin.AutoParts.part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

}
