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
public class IvisSimRepositoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "smId", nullable = false)
    private Integer smId;

    @Column(name = "mobileNo", length = 20, nullable = false)
    private String mobileNo = "";

    @Column(name = "simNo", length = 100, nullable = false)
    private String simNo = "";

    @Column(name = "provider", length = 50, nullable = false)
    private String provider = "";

    @Column(name = "plan", length = 100)
    private String plan;

    @Column(name = "simStatus", length = 20, nullable = false)
    private String simStatus = "";

    @Column(name = "hold", length = 20, nullable = false)
    private String hold = "";

    @Column(name = "activationDate")
    private LocalDateTime activationDate;

    @Column(name = "activatedBy", nullable = false)
    private String activatedBy = "";

    @Column(name = "deactivationDate")
    private LocalDateTime deactivationDate;

    @Column(name = "deactivatedBy", nullable = false)
    private String deactivatedBy = "";

    @Column(name = "frId", nullable = false)
    private Integer frId = 0;

    @Column(name = "unitId", length = 100)
    private String unitId;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "createdBy", nullable = false)
    private Integer createdBy = 0;

    @Column(name = "editedBy", nullable = false)
    private Integer editedBy = 0;

    @Column(name = "createdDate", nullable = false)
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "editedDate")
    private LocalDateTime editedDate;

    @Column(name = "unitDismantledDate")
    private LocalDateTime unitDismantledDate;

    @Column(name = "userName", length = 50)
    private String userName;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "routerUserName", length = 50)
    private String routerUserName;

    @Column(name = "routerPassword", length = 50)
    private String routerPassword;

    @Column(name = "portalUrl", length = 100)
    private String portalUrl;

    @Column(name = "managerName", length = 50)
    private String managerName;

    @Column(name = "managerNumber", length = 20)
    private String managerNumber;

    @Column(name = "alternateNumber", length = 20)
    private String alternateNumber;
}