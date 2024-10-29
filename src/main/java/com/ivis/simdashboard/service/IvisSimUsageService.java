package com.ivis.simdashboard.service;

import com.ivis.simdashboard.model.IvisSimUsage;
import com.ivis.simdashboard.repository.IvisSimUsageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class IvisSimUsageService {

    @Autowired
    private IvisSimUsageRepository ivisSimUsageRepository;

    public List<IvisSimUsage> findAll() {
        return ivisSimUsageRepository.findAll();
    }

    public IvisSimUsage findById(Long id) {
        return ivisSimUsageRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usage not found"));
    }
    @Transactional
    public IvisSimUsage save(IvisSimUsage ivisSimUsage) {
        ivisSimUsage.setCreatedTime(LocalDateTime.now());
        return ivisSimUsageRepository.save(ivisSimUsage);
    }

    public IvisSimUsage update(Long id, IvisSimUsage ivisSimUsage) {
        if (!ivisSimUsageRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usage not found");
        }
        ivisSimUsage.setPkSimUsageId(id);
        return ivisSimUsageRepository.save(ivisSimUsage);
    }

    public void delete(Long id) {
        if (!ivisSimUsageRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usage not found");
        }
        ivisSimUsageRepository.deleteById(id);
    }
}
