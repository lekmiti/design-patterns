package com.lekmiti.designpatterns.singleton;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void singleton_eager_implementation_should_always_return_the_same_instance() {
        // When
        SingletonEagerImpl instance = SingletonEagerImpl.getInstance();
        SingletonEagerImpl sameInstance = SingletonEagerImpl.getInstance();

        // Then
        assertThat("The singleton return always the same instance", instance, is(sameInstance));

    }

    @Test
    public void singleton_static_implementation_should_always_return_the_same_instance() {
        // When
        SingletonStaticImpl instance = SingletonStaticImpl.getInstance();
        SingletonStaticImpl sameInstance = SingletonStaticImpl.getInstance();

        // Then
        assertThat("The singleton return always the same instance", instance, is(sameInstance));

    }


}