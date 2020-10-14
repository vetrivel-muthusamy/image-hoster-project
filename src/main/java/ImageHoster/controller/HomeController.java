package ImageHoster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("**************************** Home Controller ****************************");
    }

    @RequestMapping("/")
    public String getAllImages(Model model) {
        return "index";
    }
}