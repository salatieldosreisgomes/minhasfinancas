package com.salatiel.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salatiel.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
