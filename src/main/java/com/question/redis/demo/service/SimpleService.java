package com.question.redis.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SimpleService {

    @Autowired
    StringRedisTemplate stringRedisTemplate ;
    @Autowired
    RedisTemplate redisTemplate;

    public void run(){

        final String preifx = "new_broker_is_primary_part_uid_144145086";
        final String STR_Key = preifx+":stringRT";
        final String TR_Key = preifx+":RT";
        //添加key
//        stringRedisTemplate.opsForValue().set("user","张三");
        Boolean f = Boolean.FALSE;
        stringRedisTemplate.opsForValue().set(STR_Key,f.toString()); // jedis
        redisTemplate.opsForValue().set(TR_Key,f.toString()); // jedis
        //获取key
//        log.info("从redis中获取key=user的值为：{}",stringRedisTemplate.opsForValue().get("user"));
        log.info("stringRedisTemplate 写入：{}",stringRedisTemplate.opsForValue().get(STR_Key));
        log.info("redisTemplate 写入：{}",redisTemplate.opsForValue().get(TR_Key));

        //删除key
//        stringRedisTemplate.delete("user");

    }
}