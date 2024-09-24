package com.generation.luminar.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class ProductFormDto {
    private String name;
    private String description;
    private int quantity;
    private Double price;
    private MultipartFile image;
}
