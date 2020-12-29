package com.services.dvdRental;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

// @RestController is short for using both @Controller and @ResponseBody
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // @GetMapping ensures that GET requests to /greeting are mapped to this method
    @GetMapping("/greeting")
//    @RequestMapping(method=RequestMethod.GET) // does the same thing
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name) {
        // @RequestParam binds value of the query string parameter 'name' into the 'name' parameter of the 'greeting()' method
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


}
