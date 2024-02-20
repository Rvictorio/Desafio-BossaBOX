package com.rafaelvictorio.desafiobossabox.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter

public class Tools {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;
    private String link;
    private String description;
    private List<String> tags;

    public Tools(Long id, String title, String link, String description, List<String> tags) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.description = description;
        this.tags = tags;
    }

    public Tools(String title, String link, String description, List<String> tags) {
    }
}
