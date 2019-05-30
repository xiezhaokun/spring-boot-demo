package com.example.demo.condition;


import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author xiezhaokun
 */
@Conditional({ConditionOne.class, ConditionTwo.class})
@Component("testBean")
public class TestBean {

    public TestBean() {
        System.out.println("init TestBean()");
    }

    @interface EnumA {

    }


}
