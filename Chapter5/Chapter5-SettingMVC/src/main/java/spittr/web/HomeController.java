package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Chohee on 9/11/16.
 */

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

    @RequestMapping(method=GET)
    public String home() {
        return "home";
    }
}
