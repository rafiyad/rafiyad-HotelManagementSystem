package com.rafiyadhotel.hotelmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String phoneNo;


}
