package com.example.km_to.mile_converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KmToMileController {

    private final KmToMileService kmToMileService;

    @Autowired
    public KmToMileController(KmToMileService kmToMileService) {
        this.kmToMileService = kmToMileService;
    }

    @GetMapping("/convert")
    public double convertKmToMile(@RequestParam double kilometers){
        return kmToMileService.convert(kilometers);
    }
}
