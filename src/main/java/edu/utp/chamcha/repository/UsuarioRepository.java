package edu.utp.chamcha.repository;


    
import edu.utp.chamcha.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, String>{

    
}
    

