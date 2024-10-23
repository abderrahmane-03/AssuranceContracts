package com.entity;


import com.Assurance.enums.Status;

import jakarta.persistence.*;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String documentsProvided;

    @Enumerated(EnumType.STRING)
    private Status Status;

    @ManyToOne
    private Client client;

    @OneToOne
    @JoinColumn(name = "devis_id")
    private Devis devis;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentsProvided() {
        return documentsProvided;
    }

    public void setDocumentsProvided(String documentsProvided) {
        this.documentsProvided = documentsProvided;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }
}
