package com.loura.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.loura.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class CategoryDto {

    private Integer id;

    private String code;

    private String destination;

    @JsonIgnore
    private List<ArticleDto> articles;

    public static CategoryDto fromEntity(Category category){
        if (category == null){
            return null;
            //TODO throw an exeption
        }

        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .destination(category.getDestination())
                .articles(
                        category.getArticles() != null ?
                                category.getArticles().stream()
                                        .map(ArticleDto::fromEntity)
                                        .collect(Collectors.toList()) : null
                )
                .build();
    }

    public static Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return null;
            //TODO throw an exeption
        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDestination(categoryDto.getDestination());

        return category;
    }
}
