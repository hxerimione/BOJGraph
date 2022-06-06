package BOJGraph.core.controller;

import BOJGraph.core.grade.UserDBRepository;
import BOJGraph.core.grade.UserEntity;
import BOJGraph.core.grade.UserForm;
import BOJGraph.core.grade.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    private static ObjectId userId;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user/new")
    public String create(UserForm form){

        userService.saveUser(form.getName());

        return "redirect:/user/"+form.getName();

    }

    @GetMapping(value = "/user/{username}")
    //@ResponseBody
    public String checkedProblem(@PathVariable("username")String username, Model model){
        UserEntity user = userService.findByName(username);
        model.addAttribute("username",username);
        Long[] level = user.getLevel();
        Long[] result = {0L,0L,0L,0L,0L,0L};
        for (int i = 1; i < 31; i++) {
            result[(i-1)/5] += level[i];
        }
        model.addAttribute("level",result);
        return "boj-check";
    }
    @GetMapping(value = "/user/{username}/exp")
    public String checkedExp(@PathVariable("username")String username, Model model){
        UserEntity user = userService.findByName(username);
        model.addAttribute("username",username);
        model.addAttribute("exp",user.getExp());
        return "boj-exp";
    }


}
