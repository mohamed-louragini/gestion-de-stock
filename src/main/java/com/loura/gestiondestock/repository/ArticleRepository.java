package com.loura.gestiondestock.repository;

import com.loura.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {

    //@Query("select a from article where codearticle = :code and designation = :designation")
    List<Article> findByCustomQuery(@Param("code") String c, @Param("designation") String d);
}
