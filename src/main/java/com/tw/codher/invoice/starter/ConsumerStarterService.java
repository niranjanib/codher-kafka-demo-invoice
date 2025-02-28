package com.tw.codher.invoice.starter;

import com.tw.codher.invoice.consumer.OrderCreatedEventConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsumerStarterService implements CommandLineRunner {
    @Autowired
    OrderCreatedEventConsumer consumer;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" ::: Starting OrderCreated Event Consumer ::: ");
        consumer.consume();
    }
}
