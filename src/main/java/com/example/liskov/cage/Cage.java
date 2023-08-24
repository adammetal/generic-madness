package com.example.liskov.cage;

import java.util.Collection;

import com.example.liskov.animal.Animal;

public interface Cage<T extends Animal> {
  boolean addAnimal(T a);
  T getAnimalByName(String name);
  void massCaging(Collection<? extends T> animals);
}
