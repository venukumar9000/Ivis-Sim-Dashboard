package com.ivis.simdashboard.repository;

import com.ivis.simdashboard.model.IvisSimRepEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IvisSimRepository extends JpaRepository<IvisSimRepEntity,Integer> {
}
