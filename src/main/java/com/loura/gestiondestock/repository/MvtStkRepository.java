package com.loura.gestiondestock.repository;

import com.loura.gestiondestock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<Integer, MvtStk> {
}
