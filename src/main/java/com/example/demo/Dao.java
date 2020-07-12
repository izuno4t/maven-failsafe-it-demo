package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Dao {
    public List<String> select(String name) {
        return Arrays.asList(1, 2, 3).stream().map(i -> String.format("%s-%d", name, i)).collect(Collectors.toList());
    }
}
