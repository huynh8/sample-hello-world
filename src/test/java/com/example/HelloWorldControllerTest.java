package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloWorldControllerTest {
    @InjectMocks
    private HelloWorldController helloWorldController;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void callPrintHelloWorldInHelloWorldController() {
        //assemble

        //action
        String result = helloWorldController.printHelloWorld();

        //asserts
        assertThat(result, is("hello world!"));
    }
}
