package BOJGraph.core.controller;

import BOJGraph.core.JsonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final JsonService jsonService;
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return jsonService.getFirstData();
    }
}
