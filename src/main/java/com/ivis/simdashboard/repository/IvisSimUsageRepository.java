package com.ivis.simdashboard.repository;

import com.ivis.simdashboard.model.IvisSimUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IvisSimUsageRepository extends JpaRepository<IvisSimUsage, Long> {
    // Additional custom queries can be defined here if needed
}
