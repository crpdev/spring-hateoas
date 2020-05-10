package com.crpdev.spring.hateoas.resource;

import com.crpdev.spring.hateoas.model.User;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rajapandian
 * Date: 10/05/20
 * Project: spring-hateoas
 * Package: com.crpdev.spring.hateoas.resource
 **/

@RestController
@RequestMapping("/rest/users")
public class UserController {

    @GetMapping("/all")
    public List<User> getAll(){
        User raja = new User("Raja", 5000L);
        User gokul = new User("Gokul", 6000L);
        return Arrays.asList(raja, gokul);
    }

    @GetMapping(value = "/hateoas/all", produces = MediaTypes.HAL_JSON_VALUE)
    public List<User> getHateOASAll(){
        User raja = new User("Raja", 5000L);
        Link rajaLink = WebMvcLinkBuilder.linkTo(UserController.class).slash(raja.getName()).withSelfRel();
        raja.add(rajaLink);
        User gokul = new User("Gokul", 6000L);
        Link gokulLink = WebMvcLinkBuilder.linkTo(UserController.class).slash(gokul.getName()).withSelfRel();
        gokul.add(gokulLink);
        return Arrays.asList(raja, gokul);
    }

}
