package com.example.liskov.animal;

public class Lion extends Animal {
  @Override
  public void makeNoise() {
    System.out.println("Roar");
  }
}
