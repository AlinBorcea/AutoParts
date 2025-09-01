package dev.alin.AutoParts.part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PartController {

    @Autowired
    private PartService service;

    @RequestMapping("/part")
    public String getPartPage(Model model) {
        return "part_page";
    }
}
