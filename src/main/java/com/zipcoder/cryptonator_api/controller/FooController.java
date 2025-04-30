package com.zipcoder.cryptonator_api.controller;

/**
 * Created by leon on 1/22/18.
 */
import com.zipcoder.cryptonator_api.domain.Foo;
import com.zipcoder.cryptonator_api.services.FooService;
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
}
