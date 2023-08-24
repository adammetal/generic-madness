package com.example.liskov.cage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.liskov.animal.Animal;

public class IronCage implements Cage<Animal> {
  private List<Animal> animals;

  public IronCage() {
    this.animals = new ArrayList<Animal>();
  }

  @Override
  public boolean addAnimal(Animal a) {
    // ..
    return true;
  }

  @Override
  public Animal getAnimalByName(String name) {
    return null;
  }

  @Override
  public void massCaging(Collection<? extends Animal> animals) {
  }
}
