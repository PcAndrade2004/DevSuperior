package com.desafioclienteCRUD.desafioCRUD.dto;

import com.desafioclienteCRUD.desafioCRUD.entity.Client;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    private String name;

    private String cpf;

    private double income;

    private LocalDate localDate;

    private Integer children;

    public ClientDTO(Long id, String name, String cpf, double income, LocalDate localDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.localDate = localDate;
        this.children = children;
    }

    public ClientDTO(Client  dto) {
        id = dto.getId();
        name = dto.getName();
        cpf = dto.getCpf();
        income = dto.getIncome();
        localDate = dto.getBirthDate();
        children = dto.getChildren();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getIncome() {
        return income;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Integer getChildren() {
        return children;
    }
}
