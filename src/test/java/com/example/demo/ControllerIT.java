package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Tag("IT")
@SpringBootTest
class ControllerIT {

    @Autowired
    Controller controller;

    @Test
    void runNoArg() throws Exception {
        controller.run(new String[0]);
    }

    @Test
    void run() throws Exception {
        controller.run("テスト");
    }
}