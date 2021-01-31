package com.company.factory_design_pattern;

public class BMW_Builder implements Car
{
    String brand;
    String color;
    String price;

    @Override
    public void set_brand() {
        System.out.println("BMW car is being built");
    }


}
