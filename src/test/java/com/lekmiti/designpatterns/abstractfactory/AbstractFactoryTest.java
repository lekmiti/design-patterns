package com.lekmiti.designpatterns.abstractfactory;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class AbstractFactoryTest {

    @Test
    public void should_return_the_correct_sound_based_on_the_animal() throws Exception {

        // Given
        final AbstractFactory<Animal, String> animalFactory = FactoryProvider.getFactory("Animal");
        final Animal cat = animalFactory.create("Cat");
        final Animal dog = animalFactory.create("Dog");
        final Animal coq = animalFactory.create("Coq");

        // Then
        assertThat(cat.makeSound(), is("Miaw Miaw"));
        assertThat(dog.makeSound(), is("Haw Haw"));
        assertThat(coq.makeSound(), is("Coq Coq"));
    }

    @Test
    public void should_return_the_correct_color_based_on_the_argument() throws Exception {

        // Given
        final AbstractFactory<Color, String> colorFactory = FactoryProvider.getFactory("Color");
        final Color red = colorFactory.create("Red");
        final Color blue = colorFactory.create("Blue");
        final Color green = colorFactory.create("Green");

        // Then
        assertThat(red.getColor(), is("Red"));
        assertThat(blue.getColor(), is("Blue"));
        assertThat(green.getColor(), is("Green"));
    }

}