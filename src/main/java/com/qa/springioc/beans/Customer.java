package com.qa.springioc.beans;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
@Scope("singleton")
@Lazy
public class Customer {
    private int id;
    private String name;
    private String email;
    private String contactNo;
    @Autowired
    private List<Order> ordersList;

    public void init() {
        System.out.println("Init method of Customer Bean");
    }

    /*
     * Will be called only for singleton instances
     */
    public void destroy() {
        System.out.println("Destroy method of Customer Bean");
    }
}
