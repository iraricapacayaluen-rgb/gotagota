package com.senati.gotagota.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senati.gotagota.entity.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
}
