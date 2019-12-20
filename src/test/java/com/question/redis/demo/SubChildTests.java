package com.question.redis.demo;

import com.question.redis.demo.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubChildTests {
//    @Autowired
    ChildStringService childStringService1;//
    @Autowired()
	ParentService parentService;//2
//    @Autowired
    ParentService<String> stringParentService;//3
    @Autowired
	ChildNormalService childNormalService;
    @Autowired
	ChildObjectService childObjectService;

//    @Autowired
//	ParentService<Object> objectParentService;

//    @Autowired   		// 会报错
//    ChildStringService2 childStringService2;

//	@Autowired
//	ParentStrong parentStrong;
//	@Autowired
//	ChildStrong childStrong;

    @Test
    public void contextLoads() {
        System.out.println(childStringService1 == stringParentService); //true
        System.out.println(parentService == stringParentService); // false
//		System.out.println(childNormalService==childObjectService);  // 不能比较 那就分别输出
		childNormalService.sayMyName();
		childObjectService.sayMyName();
//		System.out.println(childStringService2 == childStringService);  // 不能比较 ，而且两个类只能注入一个。
//        childStringService1.sayMyName();
		System.out.println(parentService == childNormalService); // false
//        childStringService2.sayMyName();
//		System.out.println(parentStrong == childStrong);
    }

}
