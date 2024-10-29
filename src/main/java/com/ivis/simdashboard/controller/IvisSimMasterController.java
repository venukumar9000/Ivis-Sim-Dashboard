package com.ivis.simdashboard.controller;

import com.ivis.simdashboard.dto.IvisSimMasterDTO;
import com.ivis.simdashboard.service.IvisSimMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sim-master")
public class IvisSimMasterController {

    @Autowired
    private IvisSimMasterService service;

    @GetMapping("/getAll")
    public List<IvisSimMasterDTO> getAllSimMasters() {
        return service.getAllSimMasters();
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<IvisSimMasterDTO> getSimMasterById(@PathVariable Long id) {
        return service.getSimMasterById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public IvisSimMasterDTO createSimMaster(@RequestBody IvisSimMasterDTO simMasterDTO) {
        return service.createSimMaster(simMasterDTO);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<IvisSimMasterDTO> updateSimMaster(@PathVariable Long id, @RequestBody IvisSimMasterDTO updatedSimMasterDTO) {
        return service.updateSimMaster(id, updatedSimMasterDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteSimMaster(@PathVariable Long id) {
        service.deleteSimMaster(id);
        return ResponseEntity.noContent().build();
    }
}
