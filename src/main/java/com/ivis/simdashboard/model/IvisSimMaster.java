package com.ivis.simdashboard.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ivis_sim_master")
public class IvisSimMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sm_id", nullable = false)
    private int smId;

    @Column(name = "sim_no", nullable = false, length = 30)
    private String simNo;


    @Column(name = "mobile_no", nullable = false, length = 10)
    private String mobileNo;

    @Column(name = "provider", nullable = false, length = 20)
    private String provider;

    @Column(name = "created_by", nullable = false, length = 20)
    private String createdBy;

    @Column(name = "updated_by", nullable = false, length = 20)
    private String updatedBy;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;
}
