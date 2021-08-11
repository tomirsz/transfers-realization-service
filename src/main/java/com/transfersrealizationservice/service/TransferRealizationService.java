package com.transfersrealizationservice.service;

import com.kodilla.commons.NewTransaction;
import com.kodilla.commons.Transfer;
import com.transfersrealizationservice.mapper.TransferMapper;
import com.transfersrealizationservice.repository.TransferRealizationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransferRealizationService {

    private final TransferRealizationRepository repository;
    private final TransferMapper transferMapper;
    private final NewTransactionProducer newTransactionProducer;

    public void makeTransfer(Transfer transfer) {
        repository.save(transferMapper.mapTransferToTransferRealization(transfer));
        NewTransaction transaction = transferMapper.mapToNewTransaction(transfer);
        newTransactionProducer.sendNewTransaction(transaction);
    }
}
