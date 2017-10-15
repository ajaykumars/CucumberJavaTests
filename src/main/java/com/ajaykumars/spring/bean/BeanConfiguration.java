package com.ajaykumars.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * Created by ajaykumars on 10/14/2017.
 */

@Configuration
public class BeanConfiguration {


    @Bean(name = "shared.data.map")
    public HashMap<String, String> initializeSharedDataMap() {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("key","value");

        return map;
    }


}
