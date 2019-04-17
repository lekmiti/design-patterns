package com.lekmiti.designpatterns.singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void should_always_return_the_same_instance() {
        // When
        SingletonEagerImpl instance = SingletonEagerImpl.getInstance();
        SingletonEagerImpl sameInstance = SingletonEagerImpl.getInstance();

        // Then
        assertThat("The singleton return always the same instance", instance, is(sameInstance));

    }

}