package com.question.redis.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChildObjectService extends ParentService<Object> {
    @Override
    public void sayMyName() {
        System.out.println("泛型为 Object 的 子类");
    }
}
