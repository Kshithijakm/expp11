
package com.devops.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App calculator = new App();

    @Test

    void testAdd() {


        assertEquals(10, calculator.add(5,5));

    }

    @Test

    void testMultiply() {

        assertEquals(20, calculator.multiply(4,5));

    }

}