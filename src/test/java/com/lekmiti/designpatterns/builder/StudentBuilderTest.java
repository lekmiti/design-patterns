package com.lekmiti.designpatterns.builder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StudentBuilderTest {

    @Test
    public void should_be_able_to_instanciate_new_object_with_a_flexible_manner() {

        // Given
        String expectedStudent = "1,Mohamed,null,26,null,null,null,null";

        // When
        Student student = new Student.StudentBuilder()
                .setId(1L)
                .setAge(26)
                .setFirstName("Mohamed")
                .build();

        //Then
        assertThat(student.toString(), is(expectedStudent));

    }

}