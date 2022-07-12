package BOJGraph.core.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/boj-check")
    public String bojCheck(@RequestParam("username") String username,Model model){
        model.addAttribute("username",username);
        return "boj-check";
    }
}