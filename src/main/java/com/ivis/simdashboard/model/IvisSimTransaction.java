package com.ivis.simdashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "ivis_sim_transaction")
public class IvisSimTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int smId;
    private int simRepoId;
    private int smSimRepoId;
    private String txStatus;
    private Integer issuedBy;
    private LocalDateTime issuedDate;
    private int receivedBy;
    private LocalDateTime receivedDate;
    private int frId;
    private int smFrId;
    private String remarks;

    // Getters and Setters
}
