package com.company.prototype_pattern;

public class CloneFactory  {

    public Car getClone(Car car) throws CloneNotSupportedException {
        return car.makeCopy();
    }

}
