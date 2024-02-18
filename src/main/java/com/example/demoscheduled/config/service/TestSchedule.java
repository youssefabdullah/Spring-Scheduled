package com.example.demoscheduled.config.service;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Logger;

@Component
public class TestSchedule {
    @Scheduled(fixedDelay = 2000 )
    @Async
    public void test() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("test " + Thread.currentThread().getName()+" "+ LocalDateTime.now());
    }
    //fixedRate هي اللي بتتحكم كل قد اي اشغل Method
    //cron هنا بنكتب expertion اليوم اللي هيترن فيه method
}
