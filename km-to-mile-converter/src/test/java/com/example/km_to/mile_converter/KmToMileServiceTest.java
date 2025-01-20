package com.example.km_to.mile_converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KmToMileServiceTest {

    private final KmToMileService kmToMileService = new KmToMileService();

    @Test
    public void testConvert()
    {
        double kilometers = 5;
        double expectedMiles = 5 * 0.621371;
        assertEquals(expectedMiles, kmToMileService.convert(kilometers));
    }
}
