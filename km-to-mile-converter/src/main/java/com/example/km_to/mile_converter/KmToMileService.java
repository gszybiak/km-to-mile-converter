package com.example.km_to.mile_converter;

import org.springframework.stereotype.Service;

@Service
public class KmToMileService {

    private static final double KM_TO_MILE_CONVERSION_RATE = 0.621371;

    public double convert(double kilometers){
        return kilometers * KM_TO_MILE_CONVERSION_RATE;
    }
}
