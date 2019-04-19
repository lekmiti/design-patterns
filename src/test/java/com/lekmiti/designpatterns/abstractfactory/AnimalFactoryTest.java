package com.lekmiti.designpatterns.abstractfactory;


import org.junit.Test;
import org.mockito.internal.matchers.InstanceOf;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnimalFactoryTest {

    @Test
    public void should_create_the_animal_based_on_his_name() throws Exception {
        // Given
        AnimalFactory animalFactory = new AnimalFactory();

        // When
        final Animal cat = animalFactory.create("Cat");
        final Animal dog = animalFactory.create("Dog");
        final Animal coq = animalFactory.create("Coq");

        // Then
        assertThat(cat, instanceOf(Cat.class));
        assertThat(dog, instanceOf(Dog.class));
        assertThat(coq, instanceOf(Coq.class));
    }

    @Test(expected = Exception.class)
    public void should_throw_exception_when_the_sought_object_is_not_handled_by_the_factory() throws Exception {
        // Given
        AnimalFactory animalFactory = new AnimalFactory();

        // When
        animalFactory.create("unhandled type");
    }
}