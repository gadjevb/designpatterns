package com.clouway.singleton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class SingletonTest {

  @Test
  public void happyPath() throws Exception {
    Singleton singleton = Singleton.getInstance();
    assertThat("com.clouway.singleton.Singleton", is(singleton.getClass().getName()));
  }
}