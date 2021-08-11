package com.transfersrealizationservice.mapper;

import com.kodilla.commons.NewTransaction;
import com.kodilla.commons.Transfer;
import com.transfersrealizationservice.model.entity.TransferRealization;
import org.springframework.stereotype.Service;

@Service
public class TransferMapper {

    public TransferRealization mapTransferToTransferRealization(Transfer transfer) {
        TransferRealization transferRealization = new TransferRealization();
        transferRealization.setSenderAccount(transfer.getSenderAccount());
        transferRealization.setRecipientAccount(transfer.getRecipientAccount());
        transferRealization.setTitle(transfer.getTitle());
        transferRealization.setAmount(transfer.getAmount());

        return transferRealization;
    }

    public NewTransaction mapToNewTransaction(Transfer transfer) {
        NewTransaction transaction = new NewTransaction();
        transaction.setSenderAccount(transfer.getSenderAccount());
        transaction.setRecipientAccount(transfer.getRecipientAccount());
        transaction.setAmount(transfer.getAmount());
        return transaction;
    }
}
