package be.cromheeke.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomePageController {

    private static final String HOME_PAGE = "home";

    @RequestMapping(method = RequestMethod.GET)
    String findAll() {
        return HOME_PAGE;
    }

}
