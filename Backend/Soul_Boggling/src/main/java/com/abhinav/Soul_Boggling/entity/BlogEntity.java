package com.abhinav.Soul_Boggling.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Blogs")
public class BlogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String title;
    private String content;
    private String category;
}
