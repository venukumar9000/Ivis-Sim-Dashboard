package com.ivis.simdashboard.service;


import com.ivis.simdashboard.dto.IvisSimRepositoryDto;
import com.ivis.simdashboard.mapper.IvisSimRepositoryMapper;
import com.ivis.simdashboard.model.IvisSimRepositoryEntity;
import com.ivis.simdashboard.repository.IvisSimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IvisSimRepositoryService {

    @Autowired
    private IvisSimRepository ivisSimRepository;


    public IvisSimRepositoryDto createSim(IvisSimRepositoryDto simDto) {
        IvisSimRepositoryEntity sim = IvisSimRepositoryMapper.toEntity(simDto,null);
        IvisSimRepositoryEntity savedSim = ivisSimRepository.save(sim);
        return IvisSimRepositoryMapper.toDto(savedSim);
    }

    public IvisSimRepositoryDto getSimById(Integer id) {
        IvisSimRepositoryEntity sim = ivisSimRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sim not found with id " + id));
        return IvisSimRepositoryMapper.toDto(sim);
    }

    public List<IvisSimRepositoryDto> getAllSims() {
        return ivisSimRepository.findAll()
                .stream()
                .map(IvisSimRepositoryMapper::toDto)
                .collect(Collectors.toList());
    }

    public IvisSimRepositoryDto updateSim(Integer id, IvisSimRepositoryDto simDto) {
        IvisSimRepositoryEntity existingSim = ivisSimRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sim not found with id " + id));

        IvisSimRepositoryMapper.toEntity(simDto, existingSim);

        IvisSimRepositoryEntity updatedSim = ivisSimRepository.save(existingSim);
        return IvisSimRepositoryMapper.toDto(updatedSim); // Convert updated Entity to DTO
    }


    public void deleteSim(Integer id) {
        ivisSimRepository.deleteById(id);
    }
}
