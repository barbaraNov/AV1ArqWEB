package com.exemplo.avaliacao.repository;

import com.exemplo.avaliacao.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}