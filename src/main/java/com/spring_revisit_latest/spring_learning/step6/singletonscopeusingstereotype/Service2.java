package com.spring_revisit_latest.spring_learning.step6.singletonscopeusingstereotype;

import org.springframework.stereotype.Service;

@Service
public class Service2 {

    private final BlogRepository repository;

    Service2(BlogRepository repository) {
        this.repository = repository;
    }

    public BlogRepository getRepository() {
        return repository;
    }
}
