package com.ivis.simdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IvisSimRepositoryDto {
    private Integer id;
    private String mobileNo;
    private String simNo;
    private String provider;
    private String plan;
    private String simStatus;
    private String hold;
    private LocalDateTime activationDate;
    private String activatedBy;
    private LocalDateTime deactivationDate;
    private String deactivatedBy;
    private Integer frId;
    private String unitId;
    private String type;
    private Integer createdBy;
    private Integer editedBy;
    private LocalDateTime createdDate;
    private LocalDateTime editedDate;
    private LocalDateTime unitDismantledDate;
    private String userName;
    private String password;
    private String routerUserName;
    private String routerPassword;
    private String portalUrl;
    private String managerName;
    private String managerNumber;
    private String alternateNumber;
}
