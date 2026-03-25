package com.microsservices.microsservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservices.microsservices.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long>{

}
