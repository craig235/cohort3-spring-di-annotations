package com.qa.springioc.beans;

import lombok.*;
import org.springframework.context.annotation.Scope;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    private int id;
    private int customerId;
    private double orderValue;
    private String orderDate;

    public void init() {
        System.out.println("Init method of Order Bean: "+id);
    }

    /*
     * Will be called only for singleton instances
     */
    public void destroy() {
        System.out.println("Destroy method of Order Bean: "+id);
    }
}
