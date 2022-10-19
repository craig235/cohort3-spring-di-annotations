package com.qa.springioc.config;

import com.qa.springioc.beans.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.qa.springioc")
public class BeanConfiguration {

    // factory methods
    /*
     * @Bean(name = "emp1") public Employee getEmployee() { return new
     * Employee(111,"emp1",234234.23,Arrays.asList(getHomeAddress(),getOfficeAddress
     * ())); }
     */


    @Bean(name = "order1", initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    @Lazy
    public Order getOrder1() {
        return new Order().builder().id(1).customerId(111).orderValue(9.99).orderDate("2022-10-19").build();
    }

    @Bean(name = "order2", initMethod = "init", destroyMethod = "destroy")
    //@Scope("prototype")
    public Order getOrder2() {
        return new Order().builder().id(2).customerId(111).orderValue(1.99).orderDate("2022-10-19").build();
    }
}