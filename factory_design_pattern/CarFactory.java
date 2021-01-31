package com.company.factory_design_pattern;

public class CarFactory
{

    public static  void demo(String carType)
    {
        if(carType.equalsIgnoreCase( "BMW"))
        {
            BMW_Builder bmw = new BMW_Builder();
            bmw.set_brand();
        }
        if(carType.equalsIgnoreCase("Toyota"))
        {
            Toyota_Builder toyota = new Toyota_Builder();
            toyota.set_brand();
        }
    }

}
