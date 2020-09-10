package com.zuitt.app;

public class Child extends Parent {
//    the Parent is extended, what properties or methods does Child have?
//    Annotation - tells Java that there is and override taking place
    @Override
    public void speak() {
        System.out.println("I am also a child");
    }

}
