package com.springlearn.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Voltage {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "volt",precision =10,scale = 4,nullable = false)
    private BigDecimal volt;

    @Column(name="time",nullable = false)
    private double time;


    public Voltage(BigDecimal volt, double time) {
    }
}
