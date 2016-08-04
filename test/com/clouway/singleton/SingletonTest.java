package com.clouway.singleton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class SingletonTest {

  @Test
  public void happyPath() throws Exception {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    assertThat(singleton1, is(equalTo(singleton2)));
  }
}