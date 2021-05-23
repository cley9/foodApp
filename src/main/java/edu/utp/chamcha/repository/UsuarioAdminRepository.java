package edu.utp.chamcha.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.utp.chamcha.model.UsuarioAdmin;

public interface UsuarioAdminRepository extends JpaRepository<UsuarioAdmin,String>{
    
}
