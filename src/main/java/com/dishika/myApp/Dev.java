package com.dishika.myApp;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Dev {
    @Autowired // field injection (when we do on top)
    @Qualifier("laptop")   //if we dont want to mention @Primary in any class, laptop - is the name of the instance

    // private Laptop laptop; 
    private Computer comp;

    //instance variable is created and it is assigned null (if we do not use autowired). it will give null pointer exception when we try to run it

    //if we dont want to use field injection method, we can also create a constructor

    //(autowired is optional for field and setter injection)

    //constructor injection
    
    // public Dev(Laptop laptop){
    //     this.laptop = laptop;
    // }

    //setter injection 
    // (giving error without using autowired. it does not go for autowiring by default. we need to set autowiring)
    // @Autowired
    // public void setLaptop(Laptop laptop){
    //     this.laptop = laptop;
    // }

    public void build(){
        System.out.println("Building a project");

        // laptop.compile();
        comp.compile();
    }
}
