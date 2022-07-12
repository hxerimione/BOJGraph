package BOJGraph.core.controller;

import BOJGraph.core.JsonService;
import BOJGraph.core.grade.UserApiService;
import BOJGraph.core.grade.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class ApiController {

    private final UserApiService userApiService;

    @GetMapping(value = "/{username}")
    public Map<String, Map<String,Object>> getUserApi(@PathVariable String username){
        userApiService.saveData(username);
        Map<String, Map<String,Object>> data = userApiService.findData();
        return data;
    }
}
