package ma.emsi.jpaap.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column( length = 50)
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean malade;
    private int score;

}
