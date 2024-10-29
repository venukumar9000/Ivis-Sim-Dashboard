package com.ivis.simdashboard.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ivis_sim_repository")
public class IvisSimRepEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_sim_rep_id;

    @Column(name = "sm_Id", nullable = false)
    private Integer smId;

    @Column(name = "mobile_No", length = 20, nullable = false)
    private String mobileNo = "";

    @Column(name = "sim_No", length = 100, nullable = false)
    private String simNo = "";

    @Column(name = "provider", length = 50, nullable = false)
    private String provider = "";

    @Column(name = "plan", length = 100)
    private String plan;

    @Column(name = "sim_Status", length = 20, nullable = false)
    private String simStatus = "";

    @Column(name = "hold", length = 20, nullable = false)
    private String hold = "";

    @Column(name = "activation_Date")
    private LocalDateTime activationDate;

    @Column(name = "activated_By", nullable = false)
    private Long activatedBy = 0L;

    @Column(name = "deactivation_Date")
    private LocalDateTime deactivationDate;

    @Column(name = "deactivated_By", nullable = false)
    private Long deactivatedBy = 0L;

    @Column(name = "sm_deactivated_By",nullable = false)
    private Long smDeactivatedBy = 0L;

    @Column(name = "fr_Id", nullable = false)
    private Integer frId = 0;

    @Column(name = "sm_fr_Id", nullable = false)
    private Integer smFrId = 0;

    @Column(name = "unit_Id", length = 100)
    private String unitId;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "created_By", nullable = false)
    private Long createdBy = 0L;

    @Column(name = "edited_By", nullable = false)
    private Long editedBy = 0L;

    @Column(name = "created_Date", nullable = false)
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "edited_Date")
    private LocalDateTime editedDate;

    @Column(name = "unit_Dismantled_Date")
    private LocalDateTime unitDismantledDate;

    @Column(name = "user_Name", length = 50)
    private String userName;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "router_User_Name", length = 50)
    private String routerUserName;

    @Column(name = "router_Password", length = 50)
    private String routerPassword;

    @Column(name = "portal_Url", length = 100)
    private String portalUrl;

    @Column(name = "manager_Name", length = 50)
    private String managerName;

    @Column(name = "manager_Number", length = 20)
    private String managerNumber;

    @Column(name = "alternate_Number", length = 20)
    private String alternateNumber;
}