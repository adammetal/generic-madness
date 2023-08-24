package com.example.liskov;

import com.example.liskov.animal.Animal;
import com.example.liskov.animal.Cat;
import com.example.liskov.cage.Cage;
import com.example.liskov.cage.IronCage;
import com.example.liskov.cage.SoftCage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cage<Cat> cage = new SoftCage();
        Cage<Animal> general = new IronCage();
    }
}
