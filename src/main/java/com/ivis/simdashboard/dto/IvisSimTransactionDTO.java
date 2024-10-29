package com.ivis.simdashboard.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IvisSimTransactionDTO {
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

