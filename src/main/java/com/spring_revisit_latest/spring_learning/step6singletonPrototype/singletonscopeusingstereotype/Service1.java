package com.spring_revisit_latest.spring_learning.step6singletonPrototype.singletonscopeusingstereotype;

import org.springframework.stereotype.Service;

@Service
public class Service1 {
    private final BlogRepository repository;

    Service1(BlogRepository repository) {
        this.repository = repository;
    }

    public BlogRepository getRepository() {
        return repository;
    }
}
