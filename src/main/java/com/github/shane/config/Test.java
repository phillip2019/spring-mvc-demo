package com.github.shane.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * A class description.
 * description TODO
 *
 * @author xiaowei.song
 * @version v1.0.0
 * @date 2019/05/27 11:29
 */
@Component
public class Test {
    @Value("${test.key}")
    private String testKey;

    public Test() {
    }

    public Test(String testKey) {
        this.testKey = testKey;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public String getTestKey() {
        return testKey;
    }

    public void setTestKey(String testKey) {
        this.testKey = testKey;
    }


    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("#####################");
        System.out.println(this.testKey);
    }
}
