package com.company.prototype_pattern;

public class BMW implements Car {

    String skin = "White";
    String type = "Dorset";

   public BMW()
   {
       System.out.println("Sheep is getting made.");
   }

    @Override
    public Car makeCopy() throws CloneNotSupportedException {

       System.out.println("BMW is being made");

       BMW carObject = null;

       carObject = (BMW) super.clone();

        return carObject;
    }

    public String toString()
    {
        return "BMW is a cloned car";
    }
}
