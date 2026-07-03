package com.dishika.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary  - when we have 2 objects for same class, primary will get preference
// instance name by default will be class name but wothout capital letter
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.print("Compiling code with laptop..");
    }
}
