package dev.alin.AutoParts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class AutoPartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoPartsApplication.class, args);
	}

    @RequestMapping("/")
    public String getMainPage(Model model) {
        return "parts_page";
    }

}
