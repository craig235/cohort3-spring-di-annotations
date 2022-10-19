package com.qa.springioc;

import com.qa.springioc.beans.Customer;
import com.qa.springioc.beans.Order;
import com.qa.springioc.config.BeanConfiguration;

import org.openjdk.jol.vm.VM;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        System.out.println("--- 1 ---");

        //Customer cus1 = context.getBean("cus1", Customer.class);
        Customer cus1 = context.getBean(Customer.class);
        System.out.println(cus1);


        System.out.println("--- 2 ---");

        Order order1 = context.getBean("order1", Order.class);
        System.out.println(order1);

        System.out.println("--- 3 ---");

        Order order2 = context.getBean("order2", Order.class);
        System.out.println(order2);

        System.out.println("--- 4 ---");
        System.out.println(cus1.getOrdersList().get(0) == order1);
        System.out.println(cus1.getOrdersList().get(1) == order2);

        // check memory address locations.
        System.out.println("Memory address (order1) is: "+VM.current().addressOf(order1));
        System.out.println("Memory address (order2) is: "+VM.current().addressOf(order2));
        System.out.println("Memory address (order1) is: "+VM.current().addressOf(cus1.getOrdersList().get(0)));
        System.out.println("Memory address (order2) is: "+VM.current().addressOf(cus1.getOrdersList().get(1)));
    }
}
