package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoDArrayOperationsTest {

    @Test
    public void testContainsValue() {
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(TwoDArrayOperations.containsValue(testArray, 5));
        assertFalse(TwoDArrayOperations.containsValue(testArray, 10));
        // Add more assertions to cover edge cases, like empty arrays or arrays with negative numbers.
    }

    @Test
    public void testCalculateAverage() {
        int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double expectedAverage = 5.0;
        assertEquals(expectedAverage, TwoDArrayOperations.calculateAverage(testArray), 0.001);
        // Add more assertions to cover edge cases, like arrays with single element or arrays with varying row lengths.
    }

    @Test
    public void testFindMinimumValue() {
        int[][] testArray1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expectedMinValue1 = 1;
        assertEquals(expectedMinValue1, TwoDArrayOperations.findMinimumValue(testArray1));

        int[][] testArray2 = {{-3, -2, -1}, {-6, -5, -4}};
        int expectedMinValue2 = -6;
        assertEquals(expectedMinValue2, TwoDArrayOperations.findMinimumValue(testArray2));
        // Add more assertions to cover edge cases, such as arrays with all identical elements or empty arrays.
    }
}
