package com.example.liskov.animal;

public class Cat extends Animal {
  @Override
  public void makeNoise() {
    System.out.println("Miau");
  }
}
