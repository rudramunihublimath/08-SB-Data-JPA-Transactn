package com.io.SBDataJPATransactn.service;

import com.io.SBDataJPATransactn.entity.ResourceDtls;
import com.io.SBDataJPATransactn.repository.ResourceDtlsRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResouceService {

    private ResourceDtlsRepo repo;

    public ResouceService(ResourceDtlsRepo repo) {
        this.repo = repo;
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void saveResources() {
        ResourceDtls rs1 = new ResourceDtls();
        rs1.setResourceName("RAM");
        rs1.setResourceSkill("Java");
        rs1.setResourceExpr("8 yrs");
        repo.save(rs1);

        int i = 10/0;

        ResourceDtls rs2 = new ResourceDtls();
        rs2.setResourceName("Ashok_2");
        rs2.setResourceSkill("PHP");
        rs2.setResourceExpr("9 yrs");
        repo.save(rs2);
    }   // Nothing should be saved if exception occurs in this method

}
