package com.example.demo.biz.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiezhaokun
 */
@Service
public class Scores2Service {

   // @Transactional(rollbackFor = Exception.class)
    public void test() {
        System.out.println("test()");
    }

}
