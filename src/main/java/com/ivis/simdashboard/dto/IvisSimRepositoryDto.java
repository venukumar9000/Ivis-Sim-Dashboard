package com.ivis.simdashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.callback.LanguageCallback;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IvisSimRepositoryDto {
    private Integer pk_sim_rep_id;
    private Integer smId;
    private String mobileNo;
    private String simNo;
    private String provider;
    private String plan;
    private String simStatus;
    private String hold;
    private LocalDateTime activationDate;
    private Long activatedBy;
    private LocalDateTime deactivationDate;
    private Long deactivatedBy;
    private Long smDeactivatedBy;
    private Integer frId;
    private Integer smFrId;
    private String unitId;
    private String type;
    private Long createdBy;
    private Long editedBy;
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
