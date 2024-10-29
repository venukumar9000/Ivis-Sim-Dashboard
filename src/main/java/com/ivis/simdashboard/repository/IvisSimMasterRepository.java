package com.ivis.simdashboard.repository;

import com.ivis.simdashboard.model.IvisSimMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IvisSimMasterRepository extends JpaRepository<IvisSimMaster, Long> {
}
