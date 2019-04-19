package com.lekmiti.designpatterns.abstractfactory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


public class FactoryProviderTest {

    @Test
    public void should_return_the_relevant_factory() throws Exception {

        // When
        final AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");
        final AbstractFactory colorFactory = FactoryProvider.getFactory("Color");

        // Then
        assertThat(animalFactory, instanceOf(AnimalFactory.class) );
        assertThat(colorFactory, instanceOf(ColorFactory.class) );
    }


    @Test(expected = Exception.class)
    public void should_throw_exception_when_the_sought_factory_does_not_exist() throws Exception {
        // When
        final AbstractFactory uknownFactory = FactoryProvider.getFactory("Unknown Factory");
    }

}