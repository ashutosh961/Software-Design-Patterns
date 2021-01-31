package com.company.singleton_pattern;

public class demo {


    private demo() {

    }

    public static void main(String[] args)
    {
        Singleton x = Singleton.getInstance();
    }
}


 class Singleton {

     private static Singleton single_instance = null;

     // variable of type String
     public String s;

     // private constructor restricted to this class itself
     private Singleton()
     {
         s = "Hello I am a string part of Singleton class";
     }

     // static method to create instance of Singleton class
     public static Singleton getInstance()
     {
         if (single_instance == null)
             single_instance = new Singleton();

         return single_instance;
     }
 }