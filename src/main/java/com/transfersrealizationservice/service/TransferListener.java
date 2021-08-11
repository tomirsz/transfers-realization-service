package com.transfersrealizationservice.service;

import com.kodilla.commons.TransferMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class TransferListener {

    private final TransferRealizationService transferRealizationService;

    @KafkaListener(topics = "transfers")
    public void consume(@Payload TransferMessage transferMessage) {
        log.info("Consumed transferMessage: {}", transferMessage);
        transferRealizationService.makeTransfer(transferMessage.getTransfer());
    }
}
