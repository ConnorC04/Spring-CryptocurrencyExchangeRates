package com.zipcoder.cryptonator_api;

/**
 * Created by leon on 1/22/18.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crypto")
public class FooController {

    @Autowired
    private FooService service;

    @GetMapping("/{ticker}")
    public Foo getCrypto(@PathVariable String ticker) {
        return service.getFoo(ticker);
    }

    public Foo getFoo(String ticker) {
        return repository.findById(ticker.toUpperCase()).orElse(null);
    }
}
