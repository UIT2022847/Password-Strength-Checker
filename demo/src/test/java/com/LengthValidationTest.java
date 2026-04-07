package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class LengthValidationTest {
    private final LengthValidation validator = new LengthValidation();

    @Test
    void shouldReturnTrueWhenPasswordLengthIsEqualToMinLength() {
        assertTrue(validator.isValidLength("12345678"));
    }

    @Test
    void shouldReturnTrueWhenPasswordLengthIsGreaterThanMinLength() {
        assertTrue(validator.isValidLength("123456789"));
    }

    @Test
    void shouldReturnFalseWhenPasswordLengthIsLessThanMinLength() {
        assertFalse(validator.isValidLength("1234567"));
    }

    @Test
    void shouldReturnFalseWhenPasswordIsEmpty() {
        assertFalse(validator.isValidLength(""));
    }
}
