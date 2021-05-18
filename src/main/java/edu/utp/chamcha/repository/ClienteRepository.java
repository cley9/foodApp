package edu.utp.chamcha.repository;

import edu.utp.chamcha.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Integer>{

    
}