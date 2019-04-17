package com.lekmiti.designpatterns.factory;

import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.*;

public class PolygonFactoryTest {

    @Test
    public void should_create_the_correct_polygon_by_number_of_side() {
        // Given
        PolygonFactory polygonFactory = new PolygonFactory();

        // When
        Polygon triangle = polygonFactory.getPolygon(3);
        Polygon square = polygonFactory.getPolygon(4);
        Polygon pentagon = polygonFactory.getPolygon(5);

        // Then
        assertThat(triangle , instanceOf(Triangle.class));
        assertThat(square , instanceOf(Square.class));
        assertThat(pentagon , instanceOf(Pentagon.class));
    }

}