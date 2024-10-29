package com.ivis.simdashboard.mapper;

import com.ivis.simdashboard.dto.IvisSimRepositoryDto;
import com.ivis.simdashboard.model.IvisSimRepositoryEntity;

import java.time.LocalDateTime;

public class IvisSimRepositoryMapper {

    public static IvisSimRepositoryEntity toEntity(IvisSimRepositoryDto simDto, IvisSimRepositoryEntity existingSim) {
        IvisSimRepositoryEntity sim = (existingSim != null) ? existingSim : new IvisSimRepositoryEntity();

        sim.setMobileNo(simDto.getMobileNo());
        sim.setSimNo(simDto.getSimNo());
        sim.setProvider(simDto.getProvider());
        sim.setPlan(simDto.getPlan());
        sim.setSimStatus(simDto.getSimStatus());
        sim.setHold(simDto.getHold());
        sim.setActivationDate(simDto.getActivationDate());
        sim.setActivatedBy(simDto.getActivatedBy());
        sim.setDeactivationDate(simDto.getDeactivationDate());
        sim.setDeactivatedBy(simDto.getDeactivatedBy());
        sim.setFrId(simDto.getFrId());
        sim.setUnitId(simDto.getUnitId());
        sim.setType(simDto.getType());
        sim.setCreatedBy(simDto.getCreatedBy());
        sim.setEditedBy(simDto.getEditedBy());
        sim.setCreatedDate(simDto.getCreatedDate() != null ? simDto.getCreatedDate() : LocalDateTime.now());
        sim.setEditedDate(LocalDateTime.now()); // Set edited date to current time
        sim.setUnitDismantledDate(simDto.getUnitDismantledDate());
        sim.setUserName(simDto.getUserName());
        sim.setPassword(simDto.getPassword());
        sim.setRouterUserName(simDto.getRouterUserName());
        sim.setRouterPassword(simDto.getRouterPassword());
        sim.setPortalUrl(simDto.getPortalUrl());
        sim.setManagerName(simDto.getManagerName());
        sim.setManagerNumber(simDto.getManagerNumber());
        sim.setAlternateNumber(simDto.getAlternateNumber());

        return sim;
    }

    // Convert Sim entity to SimDto
    public static IvisSimRepositoryDto toDto(IvisSimRepositoryEntity sim) {
        IvisSimRepositoryDto simDto = new IvisSimRepositoryDto();
        simDto.setId(sim.getId());
        simDto.setMobileNo(sim.getMobileNo());
        simDto.setSimNo(sim.getSimNo());
        simDto.setProvider(sim.getProvider());
        simDto.setPlan(sim.getPlan());
        simDto.setSimStatus(sim.getSimStatus());
        simDto.setHold(sim.getHold());
        simDto.setActivationDate(sim.getActivationDate());
        simDto.setActivatedBy(sim.getActivatedBy());
        simDto.setDeactivationDate(sim.getDeactivationDate());
        simDto.setDeactivatedBy(sim.getDeactivatedBy());
        simDto.setFrId(sim.getFrId());
        simDto.setUnitId(sim.getUnitId());
        simDto.setType(sim.getType());
        simDto.setCreatedBy(sim.getCreatedBy());
        simDto.setEditedBy(sim.getEditedBy());
        simDto.setCreatedDate(sim.getCreatedDate());
        simDto.setEditedDate(sim.getEditedDate());
        simDto.setUnitDismantledDate(sim.getUnitDismantledDate());
        simDto.setUserName(sim.getUserName());
        simDto.setPassword(sim.getPassword());
        simDto.setRouterUserName(sim.getRouterUserName());
        simDto.setRouterPassword(sim.getRouterPassword());
        simDto.setPortalUrl(sim.getPortalUrl());
        simDto.setManagerName(sim.getManagerName());
        simDto.setManagerNumber(sim.getManagerNumber());
        simDto.setAlternateNumber(sim.getAlternateNumber());
        return simDto;
    }
}
