package com.exemplo.avaliacao.repository;

import com.exemplo.avaliacao.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}