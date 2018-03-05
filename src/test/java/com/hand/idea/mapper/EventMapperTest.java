package com.hand.idea.mapper;

import com.hand.idea.domain.Event;
import com.hand.idea.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * Created by admin on 2017/12/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EventMapperTest {

    @Autowired
    private EventMapper eventMapper;

    @Test
    public void testInsertEvent(){
       // Event event = new Event(1,"花店如何经营","生活","1.jpg","安徽","芜湖","这是一个告诉我们如何经营花店的创意","2017-12-18",1,"cccc",12);
        System.out.println("插入成功");
    }
}


