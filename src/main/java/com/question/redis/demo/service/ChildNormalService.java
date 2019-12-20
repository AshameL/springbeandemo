package com.question.redis.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChildNormalService extends ParentService {
    @Override
    public void sayMyName() {
        System.out.println("默认泛型 的 子类");
    }
}
