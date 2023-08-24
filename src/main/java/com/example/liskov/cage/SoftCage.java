package com.example.liskov.cage;

import java.util.Collection;

import com.example.liskov.animal.Cat;

public class SoftCage implements Cage<Cat> {
  @Override
  public boolean addAnimal(Cat a) {
    return true;
  }

  @Override
  public Cat getAnimalByName(String name) {
    return null;
  }

  @Override
  public void massCaging(Collection<? extends Cat> animals) {

  }
}
