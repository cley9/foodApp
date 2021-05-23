package edu.utp.chamcha.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_useradmin")
public class UsuarioAdmin {
    @Id
    @Column(name = "user_id")
    private String email;    
    private String password;
}
