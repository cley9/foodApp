package edu.utp.chamcha.repository;
import edu.utp.chamcha.model.Contacto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface  ContactoRepository extends JpaRepository<Contacto, Integer>{
   /*   @Query(value = "SELECT o FROM Producto o WHERE o.status='A'")
    List<Producto> getAllActiveProductos();
    List<Contacto> getAllContactos();
       @Query(value = "SELECT o FROM Producto o WHERE o.status='A'")
    List<Producto> getAllActiveProductos();
*/

/*
@Query(value = "SELECT o FROM Contacto o WHERE o.id=''")
List<Contacto> getAllActiveContactos();*/
}