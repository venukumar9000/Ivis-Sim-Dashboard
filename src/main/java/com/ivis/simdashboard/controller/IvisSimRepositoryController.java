package com.ivis.simdashboard.controller;

import com.ivis.simdashboard.dto.IvisSimRepositoryDto;
import com.ivis.simdashboard.service.IvisSimRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sim_repository")
public class IvisSimRepositoryController {

    @Autowired
    private IvisSimRepositoryService ivisSimRepositoryService;

    @PostMapping
    public ResponseEntity<IvisSimRepositoryDto> createSim(@RequestBody IvisSimRepositoryDto simDto) {
        IvisSimRepositoryDto createdSim = ivisSimRepositoryService.createSim(simDto);
        return new ResponseEntity<>(createdSim, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IvisSimRepositoryDto> getSimById(@PathVariable Integer id) {
        IvisSimRepositoryDto sim = ivisSimRepositoryService.getSimById(id);
        return new ResponseEntity<>(sim, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<IvisSimRepositoryDto>> getAllSims() {
        List<IvisSimRepositoryDto> sims = ivisSimRepositoryService.getAllSims();
        return new ResponseEntity<>(sims, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IvisSimRepositoryDto> updateSim(
            @PathVariable Integer id,
            @RequestBody IvisSimRepositoryDto simDto) {
        IvisSimRepositoryDto updatedSim = ivisSimRepositoryService.updateSim(id, simDto);
        return new ResponseEntity<>(updatedSim, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSim(@PathVariable Integer id) {
        ivisSimRepositoryService.deleteSim(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
