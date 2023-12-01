package com.example.seminar.entity;


import jakarta.persistence.*;
import lombok.Builder;

@Table(name = "post")
@Entity
public class PostEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @Builder
    public PostEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }
}