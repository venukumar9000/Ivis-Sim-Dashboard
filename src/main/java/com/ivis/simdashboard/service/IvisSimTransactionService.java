package com.ivis.simdashboard.service;


import com.ivis.simdashboard.dto.IvisSimTransactionDTO;
import com.ivis.simdashboard.model.IvisSimTransaction;
import com.ivis.simdashboard.repository.IvisSimTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IvisSimTransactionService {

    @Autowired
    private IvisSimTransactionRepository repository;

    public List<IvisSimTransaction> getAllTransactions() {
        return repository.findAll();
    }

    public Optional<IvisSimTransaction> getTransactionById(Long id) {
        return repository.findById(id);
    }

    public IvisSimTransaction createTransaction(IvisSimTransactionDTO dto) {
        IvisSimTransaction transaction = new IvisSimTransaction();
        transaction.setSmId(dto.getSmId());
        transaction.setSimRepoId(dto.getSimRepoId());
        transaction.setSmSimRepoId(dto.getSmSimRepoId());
        transaction.setTxStatus(dto.getTxStatus());
        transaction.setIssuedBy(dto.getIssuedBy());
        transaction.setIssuedDate(dto.getIssuedDate());
        transaction.setReceivedBy(dto.getReceivedBy());
        transaction.setReceivedDate(dto.getReceivedDate());
        transaction.setFrId(dto.getFrId());
        transaction.setSmFrId(dto.getSmFrId());
        transaction.setRemarks(dto.getRemarks());
        return repository.save(transaction);
    }

    public IvisSimTransaction updateTransaction(Long id, IvisSimTransactionDTO dto) {
        IvisSimTransaction transaction = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        transaction.setSimRepoId(dto.getSimRepoId());
        transaction.setSmSimRepoId(dto.getSmSimRepoId());
        transaction.setTxStatus(dto.getTxStatus());
        transaction.setIssuedBy(dto.getIssuedBy());
        transaction.setIssuedDate(dto.getIssuedDate());
        transaction.setReceivedBy(dto.getReceivedBy());
        transaction.setReceivedDate(dto.getReceivedDate());
        transaction.setFrId(dto.getFrId());
        transaction.setSmFrId(dto.getSmFrId());
        transaction.setRemarks(dto.getRemarks());
        return repository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        repository.deleteById(id);
    }
}
