package com.driver;
import java.util.*;

public class Main {
    public static class A{
        public String meth(){
            String st= "Invoking method from class A";
            return st;
        }
    }
    public static class B extends  A{
        public String meth(){
            String st= "Method is overridden in Extendend class B";
            return st;
        }
    }
    public static void main(String[] args) {
        B b= new B();
        b.meth();
    }
}