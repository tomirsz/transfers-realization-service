package com.transfersrealizationservice.service;

import com.kodilla.commons.NewTransaction;
import com.kodilla.commons.NewTransactionMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NewTransactionProducer {

    private static final String NEW_TRANSACTION_TOPIC = "new-transaction";
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendNewTransaction(final NewTransaction newTransaction) {
        log.info("Sending message to Kafka, newTransaction: {}", newTransaction);
        NewTransactionMessage newTransactionMessage = new NewTransactionMessage(newTransaction);
        kafkaTemplate.send(NEW_TRANSACTION_TOPIC, newTransactionMessage);
        log.info("Message was sent");
    }
}
