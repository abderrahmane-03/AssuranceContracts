package com.entity;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Health")

public class HealthInsurance extends Insurance {
    private String healthStatus;
    private String typeCoverage;


    public String setHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getTypeCoverage() {
        return typeCoverage;
    }

    public void setTypeCoverage(String typeCoverage) {
        this.typeCoverage = typeCoverage;
    }
}
