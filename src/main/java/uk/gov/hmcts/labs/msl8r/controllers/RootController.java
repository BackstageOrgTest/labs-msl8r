package uk.gov.hmcts.labs.msl8r.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

/**
 * Default endpoints per application.
 */
@RestController
public class RootController {

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        return ok("Welcome to your app, my favourite fruit is " +  System.getenv("FAVOURITE_FRUIT"));
    }
}
