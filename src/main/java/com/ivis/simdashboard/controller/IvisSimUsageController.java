package com.ivis.simdashboard.controller;

import com.ivis.simdashboard.model.IvisSimUsage;
import com.ivis.simdashboard.service.IvisSimUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/sim-usage")
public class IvisSimUsageController {

    @Autowired
    private IvisSimUsageService ivisSimUsageService;

    @GetMapping
    public ResponseEntity<List<IvisSimUsage>> getAllSimUsage() {
        List<IvisSimUsage> usageList = ivisSimUsageService.findAll();
        return new ResponseEntity<>(usageList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IvisSimUsage> getSimUsageById(@PathVariable Long id) {
        IvisSimUsage usage = ivisSimUsageService.findById(id);
        return new ResponseEntity<>(usage, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<IvisSimUsage> createSimUsage(@Valid @RequestBody IvisSimUsage ivisSimUsage) {
        IvisSimUsage createdUsage = ivisSimUsageService.save(ivisSimUsage);
        return new ResponseEntity<>(createdUsage, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IvisSimUsage> updateSimUsage(@PathVariable Long id, @Valid @RequestBody IvisSimUsage ivisSimUsage) {
        IvisSimUsage updatedUsage = ivisSimUsageService.update(id, ivisSimUsage);
        return new ResponseEntity<>(updatedUsage, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSimUsage(@PathVariable Long id) {
        ivisSimUsageService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
