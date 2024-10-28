package com.ivis.simdashboard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ivis_sim_usage")
public class IvisSimUsage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "sm_id", nullable = false)
    private Integer smId;

    @NotNull
    @Column(name = "ticketId", nullable = false)
    private Integer ticketId;

    @NotNull
    @Column(name = "sm_ticketId", nullable = false)
    private Integer smTicketId;

    @NotNull
    @Column(name = "auditId", nullable = false)
    private Integer auditId;

    @NotNull
    @Column(name = "sm_auditId", nullable = false)
    private Integer smAuditId;

    @Column(name = "unitId", length = 50)
    private String unitId;

    @NotNull
    @Column(name = "frId", nullable = false)
    private Integer frId;

    @NotNull
    @Column(name = "sm_frId", nullable = false)
    private Integer smFrId;

    @NotNull
    @Column(name = "oldSimRepoId", nullable = false)
    private Integer oldSimRepoId;

    @NotNull
    @Column(name = "sm_oldSimRepoId", nullable = false)
    private Integer smOldSimRepoId;

    @NotNull
    @Column(name = "newSimRepoId", nullable = false)
    private Integer newSimRepoId;

    @NotNull
    @Column(name = "sm_newSimRepoId", nullable = false)
    private Integer smNewSimRepoId;

    @NotNull
    @Column(name = "replaceReason", nullable = false, length = 100)
    private String replaceReason;

    @Column(name = "createdTime")
    private LocalDateTime createdTime;

    @NotNull
    @Column(name = "created_by", nullable = false, length = 50)
    private String createdBy;

}
