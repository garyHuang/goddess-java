package com.bjike.goddess.workprogress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.*;

import javax.servlet.MultipartConfigElement;
import java.io.IOException;

/**
 * 扫描com.bjike.goddess.common.consumer 加入过滤器引入userToken
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.bjike.goddess.workprogress.action", "com.bjike.goddess.common.consumer","com.bjike.goddess.workprogress.config"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = {Configuration.class})})
@PropertySource(value = {"classpath:permission.properties"},encoding="utf-8")
@ImportResource("classpath:app.xml")
@EnableAutoConfiguration(exclude = {ValidationAutoConfiguration.class})
public class Application {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("800MB");
        factory.setMaxRequestSize("800MB");
        return factory.createMultipartConfig();
    }

    public static void main(String[] args) throws IOException {

        SpringApplication.run(Application.class, args);
        System.in.read();
    }

}
