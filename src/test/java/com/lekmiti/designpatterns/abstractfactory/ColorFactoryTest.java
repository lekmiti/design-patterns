package com.lekmiti.designpatterns.abstractfactory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class ColorFactoryTest {

    @Test
    public void should_create_the_color_based_on_his_name() throws Exception {
        // Given
        ColorFactory colorFactory = new ColorFactory();

        // When
        final Color red = colorFactory.create("Red");
        final Color blue = colorFactory.create("Blue");
        final Color green = colorFactory.create("Green");

        // Then
        assertThat(red, instanceOf(Red.class));
        assertThat(blue, instanceOf(Blue.class));
        assertThat(green, instanceOf(Green.class));
    }

    @Test(expected = Exception.class)
    public void should_throw_exception_when_the_sought_object_is_not_handled_by_the_factory() throws Exception {

        // Given
        ColorFactory colorFactory = new ColorFactory();

        // When
        colorFactory.create("unhandled type");
    }
}

