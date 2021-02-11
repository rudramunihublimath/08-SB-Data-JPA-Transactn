package com.io.SBDataJPATransactn.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "RESOURCE_DTLS")
public class ResourceDtls {
    @Id
    @Column(name = "RESOURCE_ID")
    @GeneratedValue
    private Integer resourceId;
    @Column(name = "RESOURCE_NAME")
    private String resourceName;
    @Column(name = "RESOURCE_SKILL")
    private String resourceSkill;
    @Column(name = "RESOURCE_EXPR")
    private String resourceExpr;


}
