package com.DesafioDominioORM.aula.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "activities_id")
    private Activities activities;

    public Block() {
    }

    public Block(Long id, Instant inicio, Instant fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Long getId() {
        return id;
    }

    public Instant getinicio() {
        return inicio;
    }

    public void setinicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getfim() {
        return fim;
    }

    public void setfim(Instant fim) {
        this.fim = fim;
    }

    public Activities getActivities() {
        return activities;
    }

    public void setActivities(Activities activities) {
        this.activities = activities;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(id, block.id) && Objects.equals(inicio, block.inicio) && Objects.equals(fim, block.fim) && Objects.equals(activities, block.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inicio, fim, activities);
    }
}
