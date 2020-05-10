package com.crpdev.spring.hateoas.model;

import org.springframework.hateoas.RepresentationModel;

/**
 * Created by rajapandian
 * Date: 10/05/20
 * Project: spring-hateoas
 * Package: com.crpdev.spring.hateoas.model
 **/
public class User extends RepresentationModel {
    private String name;
    private Long salary;

    public User(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
