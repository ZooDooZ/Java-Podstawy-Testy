package com.example.javapodstawytesty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testCapitalizeSuccess() {
        // GIVEN
        String name = "FILIP";
        String expectedName = "Filip";

        // WHEN
        String actualName = StringUtils.capitalize(name);

        // THEN
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    @SuppressWarnings("all")
    void testCapitalizeNullParam() {
        // GIVEN
        String name = null;

        // WHEN
        String actualName = StringUtils.capitalize(name);

        // THEN
        Assertions.assertNull(actualName);
    }

    //@EmptySource(Enum.class)
    //@MethodSource("")
    @ParameterizedTest
    @ValueSource (strings = {"      ", " "})
    void testCapitalizeEmptyOrBlank(String name) {
        // WHEN
        String actualName = StringUtils.capitalize(name);

        // THEN
        Assertions.assertNull(actualName);
    }

    @Test
    void testCapitalizeEmpty() {
        // GIVEN
        String expectedName = "";

        // WHEN
        String actualName = StringUtils.capitalize(expectedName);

        // THEN
        Assertions.assertNull(actualName);
    }
}