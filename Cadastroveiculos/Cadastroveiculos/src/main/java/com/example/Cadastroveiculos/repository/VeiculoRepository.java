package com.example.Cadastroveiculos.repository;


import com.example.Cadastroveiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    
}

