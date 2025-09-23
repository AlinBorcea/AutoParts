package dev.alin.AutoParts.part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartController {

    @RequestMapping("/part")
    public String getPartPage(Model model) {
        return "part_page";
    }
}
