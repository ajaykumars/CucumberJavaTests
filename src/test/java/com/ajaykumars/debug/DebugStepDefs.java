package com.ajaykumars.debug;

import com.ajaykumars.spring.bean.BeanConfiguration;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.HashMap;

/**
 * Created by ajaykumars on 10/14/2017.
 */
@ContextConfiguration(classes = BeanConfiguration.class, loader = AnnotationConfigContextLoader.class)
public class DebugStepDefs {

    @Autowired
    @Qualifier("shared.data.map")
    HashMap<String, String> sharedDataMap;


//    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//    HashMap<String, String> sharedDataMap = (HashMap) appContext.getBean("shared.data.map");

    @Given("^This is a sample step-a$")
    public void this_is_a_sample_step_a() throws Throwable {

        sharedDataMap.put("key1","value1");
        System.out.println(sharedDataMap);

    }



    @Then("^This is a sample step-c$")
    public void this_is_a_sample_step_c() throws Throwable {

    }

}
