package com.dishika.myApp;

import org.springframework.stereotype.Component;

@Component

public class Desktop implements Computer {
    @Override
    public void compile(){
        System.out.print("Compiling code with desktop..");
    }
}
