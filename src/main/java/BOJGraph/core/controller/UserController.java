package BOJGraph.core.controller;

import BOJGraph.core.grade.User;
import BOJGraph.core.grade.UserForm;
import BOJGraph.core.grade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user/new")
    public String create(UserForm form){
        User user = new User();
        String name = form.getName();
        user.setName(name);

        System.out.println("success");
        System.out.println(">>"+form.getName());
        userService.saveUser(form.getName());

        return "redirect:/user/"+form.getName();
    }

    @GetMapping(value = "/user/{username}")
    //@ResponseBody
    public String checkedProblem(@PathVariable("username")String username, Model model){
        Long[] level = userService.findL6();
        model.addAttribute("username",username);
        model.addAttribute("level",level);
        System.out.println("user"+username);
        return "boj-check";
    }
    @GetMapping(value = "/user/{username}/exp")
    public String checkedExp(@PathVariable("username")String username, Model model){
        Long[] exp = userService.findExp();
        model.addAttribute("username",username);
        model.addAttribute("exp",exp);
        return "boj-exp";
    }


}
