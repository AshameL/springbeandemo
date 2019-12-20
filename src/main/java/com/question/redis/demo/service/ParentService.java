package com.question.redis.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ParentService<T> {
    public void sayMyName(){
        System.out.println("泛型父类 ");
    }

    public ParentService() {
        System.out.println("this 指针："+this);
        System.out.println("class 类型："+this.getClass());
    }
}
