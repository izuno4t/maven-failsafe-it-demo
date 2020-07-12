package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class ControllerTest {

    @InjectMocks
    Controller controller;

    @Mock
    Service mockService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void execute() {
        when(mockService.createNames(eq("テスト引数"))).thenReturn(Arrays.asList("テスト結果-1", "テスト結果-2", "テスト結果-3"));

        var result = controller.execute("テスト引数");

        assertThat(result).contains("テスト結果-1,テスト結果-2,テスト結果-3");

        verify(mockService, times(1)).createNames(eq("テスト引数"));
    }
}