package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void run(String... args) throws Exception {
        if (args.length == 0) {
            System.out.println("引数が不正です。");
            return;
        }

        var name = args[0];
        String result = execute(name);
        System.out.println("RESULT=" + result);
    }

    protected String execute(String name) {
        return service.createNames(name).stream().collect(Collectors.joining(","));
    }
}
