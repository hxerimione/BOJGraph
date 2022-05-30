package BOJGraph.core;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "3");
        return "hello";
    }
    @GetMapping("boj-check")
    public String bojCheck(@RequestParam("username") String username,Model model){
        model.addAttribute("username",username);
        return "boj-check";
    }
}