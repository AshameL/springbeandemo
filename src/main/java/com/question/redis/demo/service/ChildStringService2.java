package com.question.redis.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChildStringService2 extends ParentService<String> {
    @Override
    public void sayMyName() {
        System.out.println("泛型为 string 的 子类 2 号");
    }
}
