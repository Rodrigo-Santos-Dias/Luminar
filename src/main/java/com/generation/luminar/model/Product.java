package com.generation.luminar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter

@Table(name = "tb_product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "O atributo nome é obrigatório")
    @Size(max = 255, message = "O atributo nome deve conter no máximo 255 caracteres")
    private String name;

    @NotBlank(message = "O atributo descrição é obrigatório")
    private String description;

    @NotNull
    @PositiveOrZero(message = "A quantidade deve ser zero ou positivo")
    private int quantity;

    @NotNull
    @PositiveOrZero(message = "O preço deve ser zero ou positivo")
    private Double price;


    @Lob
    private String image;

    @ManyToOne
    @JsonIgnoreProperties("products")
    private Category category;

    @ManyToOne
    private User user;

}
