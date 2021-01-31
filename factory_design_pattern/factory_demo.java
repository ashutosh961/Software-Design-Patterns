package com.company.factory_design_pattern;

public class factory_demo {



    public static void main(String[] args)
    {
        CarFactory factory = new CarFactory();
        factory.demo("BMW");
        factory.demo("Toyota");
    }

}
