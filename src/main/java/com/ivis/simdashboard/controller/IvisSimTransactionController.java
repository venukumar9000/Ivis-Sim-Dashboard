package com.ivis.simdashboard.controller;


import com.ivis.simdashboard.dto.IvisSimTransactionDTO;
import com.ivis.simdashboard.model.IvisSimTransaction;
import com.ivis.simdashboard.service.IvisSimTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class IvisSimTransactionController {

    @Autowired
    private IvisSimTransactionService service;

    @GetMapping("/getAll")
    public List<IvisSimTransaction> getAllTransactions() {
        return service.getAllTransactions();
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<IvisSimTransaction> getTransactionById(@PathVariable Long id) {
        return service.getTransactionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/save")
    public IvisSimTransaction createTransaction(@RequestBody IvisSimTransactionDTO dto) {
        return service.createTransaction(dto);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<IvisSimTransaction> updateTransaction(@PathVariable Long id, @RequestBody IvisSimTransactionDTO dto) {
        return ResponseEntity.ok(service.updateTransaction(id, dto));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable Long id) {
        service.deleteTransaction(id);
        return ResponseEntity.noContent().build();
    }
}

