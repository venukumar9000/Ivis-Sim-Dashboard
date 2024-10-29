package com.ivis.simdashboard.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @Column(name = "pk_sim_usage_id")
    private Long pkSimUsageId;

    @NotNull
    @Column(name = "sm_id", nullable = false)
    private Integer smId;

    @NotNull
    @Column(name = "ticket_id", nullable = false)
    private Integer ticketId;

    @NotNull
    @Column(name = "sm_ticket_id", nullable = false)
    private Integer smTicketId;

    @NotNull
    @Column(name = "audit_id", nullable = false)
    private Integer auditId;

    @NotNull
    @Column(name = "sm_audit_id", nullable = false)
    private Integer smAuditId;

    @Column(name = "unit_id", length = 50)
    private String unitId;

    @NotNull
    @Column(name = "fr_id", nullable = false)
    private Integer frId;

    @NotNull
    @Column(name = "sm_fr_id", nullable = false)
    private Integer smFrId;

    @NotNull
    @Column(name = "old_sim_repo_id", nullable = false)
    private Integer oldSimRepoId;

    @NotNull
    @Column(name = "sm_old_sim_repo_id", nullable = false)
    private Integer smOldSimRepoId;

    @NotNull
    @Column(name = "new_sim_repo_id", nullable = false)
    private Integer newSimRepoId;

    @NotNull
    @Column(name = "sm_new_sim_repo_id", nullable = false)
    private Integer smNewSimRepoId;

    @NotNull
    @Column(name = "replace_reason", nullable = false, length = 100)
    private String replaceReason;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @NotNull
    @Column(name = "created_by", nullable = false, length = 50)
    private String createdBy;
}
