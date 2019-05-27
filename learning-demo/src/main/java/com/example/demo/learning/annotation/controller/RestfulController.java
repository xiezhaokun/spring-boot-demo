package com.example.demo.learning.annotation.controller;

import com.example.demo.learning.annotation.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiezhaokun
 */
@RestController
@RequestMapping(value = "/restful")
public class RestfulController {

    @ModelAttribute("user")
    public User user() {
        return new User("1","谢照昆","xiezk");
    }

    @ModelAttribute("user2")
    public User user2() {
        return new User("2","谢照昆","xiezk");
    }


    @PostMapping(value = "/user")
    public Object createUser(@ModelAttribute("user") User user) {
        return "success";
    }


    @PostMapping(value = "/user/{id}/{version}")
    public Object getUser(@PathVariable("id") String id,@PathVariable("version") String version, @RequestBody User user,@RequestParam("name") String name) {
        return "id:" + id + ",version=" + version + ",userId=" + user.getId() + ",userName=" + name;
    }

    @PostMapping(value = "/user/test")
    public Object getUser(@RequestBody User user) {
        return ",user=" + user.getId();
    }


}
