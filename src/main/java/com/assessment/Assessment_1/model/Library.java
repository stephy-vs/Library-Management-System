package com.assessment.Assessment_1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String category;
    private String title;
    private String author;
}
