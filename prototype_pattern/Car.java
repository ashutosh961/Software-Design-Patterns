package com.company.prototype_pattern;

public interface Car extends Cloneable {

    public Car makeCopy() throws CloneNotSupportedException;
}
