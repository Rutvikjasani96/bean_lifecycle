package com.bean_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class WithAnnotations {
    private String name;

//    Getters
    public String getName() {
        return name;
    }

//    Setters
    public void setName(String name) {
        this.name = name;
    }

//    Constructor
    public WithAnnotations() {
    }

    @PostConstruct
    public void start(){
        // init
        System.out.println("Start Called...");
    }

    @PreDestroy
    public void end(){
        // Destroy
        System.out.println("End Called...");
    }

}
