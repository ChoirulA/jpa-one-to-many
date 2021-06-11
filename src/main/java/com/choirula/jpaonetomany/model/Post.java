package com.choirula.jpaonetomany.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String title;

    @NotNull
    private String description;

    @NotNull
    @Lob
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
