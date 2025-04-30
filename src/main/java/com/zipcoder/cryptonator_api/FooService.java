package com.zipcoder.cryptonator_api;

/**
 * Created by leon on 1/22/18.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FooService {

    @Autowired
    private FooRepository repository;

    @Autowired
    private RestTemplate restTemplate;


}
