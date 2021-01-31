package com.company.prototype_pattern;

public class demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneFactory factory = new CloneFactory();

        BMW m500 = new BMW();

        BMW clonedBMW = (BMW)factory.getClone(m500);

        System.out.println(m500);
        System.out.println(clonedBMW);

        System.out.println(System.identityHashCode(System.identityHashCode(m500)));
        System.out.println(System.identityHashCode(System.identityHashCode(clonedBMW)));

    }

}
