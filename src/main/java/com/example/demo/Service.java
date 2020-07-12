package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {

    private final Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }

    public List<String> createNames(String baseName) {
        return dao.select(baseName);
    }
}
