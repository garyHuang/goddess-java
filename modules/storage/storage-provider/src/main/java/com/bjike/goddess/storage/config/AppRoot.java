package com.bjike.goddess.storage.config;

import com.alibaba.dubbo.remoting.http.servlet.DispatcherServlet;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 配置项扫描
 *
 * @Author: [liguiqin]
 * @Date: [2016-12-28 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.bjike.goddess.storage.dao"})//jpa 所在包
@EnableTransactionManagement(proxyTargetClass = true)
@EnableCaching
@PropertySource({"classpath:config.properties","classpath:redis.properties"})
@ImportResource({"classpath:application.xml"})
@ComponentScan(basePackages = {"com.bjike.goddess.storage","com.bjike.goddess.redis"},
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                value = {Configuration.class})})

public class AppRoot {

}
