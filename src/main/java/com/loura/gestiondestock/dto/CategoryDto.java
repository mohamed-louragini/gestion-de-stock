package com.loura.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.loura.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {

    private Integer id;

    private String code;

    private String destination;

    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
        if (category == null){
            return null;
            // TODO throw an exeption
        }

        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .destination(category.getDestination())
                .build();
    }

    public Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return null;
            //TODO throw an exeption
        }

        Category category = new Category();
        category.setId(category.getId());
        category.setCode(category.getCode());
        category.setDestination(categoryDto.getDestination());

        return category;
    }
}
