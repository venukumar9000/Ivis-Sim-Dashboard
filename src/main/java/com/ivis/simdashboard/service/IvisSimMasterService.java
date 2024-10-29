package com.ivis.simdashboard.service;

import com.ivis.simdashboard.dto.IvisSimMasterDTO;
import com.ivis.simdashboard.model.IvisSimMaster;
import com.ivis.simdashboard.repository.IvisSimMasterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class IvisSimMasterService {

    @Autowired
    private IvisSimMasterRepository repository;

    public List<IvisSimMasterDTO> getAllSimMasters() {
        return repository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public Optional<IvisSimMasterDTO> getSimMasterById(Long id) {
        return repository.findById(id).map(this::convertToDto);
    }

    public IvisSimMasterDTO createSimMaster(IvisSimMasterDTO simMasterDTO) {
        IvisSimMaster simMaster = convertToEntity(simMasterDTO);
        return convertToDto(repository.save(simMaster));
    }

    public Optional<IvisSimMasterDTO> updateSimMaster(Long id, IvisSimMasterDTO updatedSimMasterDTO) {
        return repository.findById(id).map(existingSimMaster -> {
            existingSimMaster.setSimNo(updatedSimMasterDTO.getSimNo());
            existingSimMaster.setMobileNo(updatedSimMasterDTO.getMobileNo());
            existingSimMaster.setProvider(updatedSimMasterDTO.getProvider());
            existingSimMaster.setUpdatedBy(updatedSimMasterDTO.getUpdatedBy());
            existingSimMaster.setUpdatedTime(updatedSimMasterDTO.getUpdatedTime());
            return convertToDto(repository.save(existingSimMaster));
        });
    }

    public void deleteSimMaster(Long id) {
        repository.deleteById(id);
    }

    private IvisSimMasterDTO convertToDto(IvisSimMaster simMaster) {
        return IvisSimMasterDTO.builder()
                .id(simMaster.getId())
                .smId(simMaster.getSmId())
                .simNo(simMaster.getSimNo())
                .mobileNo(simMaster.getMobileNo())
                .provider(simMaster.getProvider())
                .createdBy(simMaster.getCreatedBy())
                .updatedBy(simMaster.getUpdatedBy())
                .createdTime(simMaster.getCreatedTime())
                .updatedTime(simMaster.getUpdatedTime())
                .build();
    }

    private IvisSimMaster convertToEntity(IvisSimMasterDTO dto) {
        return IvisSimMaster.builder()
//                .id(dto.getId())
                .smId(dto.getSmId())
                .simNo(dto.getSimNo())
                .mobileNo(dto.getMobileNo())
                .provider(dto.getProvider())
                .createdBy(dto.getCreatedBy())
                .updatedBy(dto.getUpdatedBy())
                .createdTime(dto.getCreatedTime())
                .updatedTime(dto.getUpdatedTime())
                .build();
    }
}