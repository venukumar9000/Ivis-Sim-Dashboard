package com.ivis.simdashboard.repository;
import com.ivis.simdashboard.model.IvisSimTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IvisSimTransactionRepository extends JpaRepository<IvisSimTransaction, Long> {

}

