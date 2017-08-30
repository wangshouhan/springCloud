package com.kangda.Controller;

import com.kangda.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by shouhan on 2017/8/29.
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/user/{id}")
    public User findById(@PathVariable long id){
        return this.restTemplate.getForObject("http://localhost:8000/"+id,User.class);
    }
}
