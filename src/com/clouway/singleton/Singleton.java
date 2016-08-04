package com.clouway.singleton;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class Singleton {
  private static Singleton instance = null;

  private Singleton() {
    System.out.println("Singleton created");
  }

  public static Singleton getInstance() {

    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }
}
