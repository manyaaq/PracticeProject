package com.example.demo.service;

import com.example.demo.model.Order;
import org.springframework.transaction.annotation.Transactional;

public interface EmailService {
        void sendSimpleMessage(Long id, String answer);

        @Transactional
        Order readOrders(Long id, String answer);

}
