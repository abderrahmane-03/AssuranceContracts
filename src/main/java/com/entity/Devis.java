package com.entity;

import jakarta.persistence.*;
import com.Assurance.enums.Status;
@Entity
public class Devis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double premiumBase;
    private double premiumTotal;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    private Insurance insurance;

    @OneToOne(mappedBy = "devis")
    private Subscription subscription;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getPremiumBase() {
        return premiumBase;
    }

    public void setPremiumBase(double premiumBase) {
        this.premiumBase = premiumBase;
    }

    public double getPremiumTotal() {
        return premiumTotal;
    }

    public void setPremiumTotal(double premiumTotal) {
        this.premiumTotal = premiumTotal;
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }


}
