package codewars.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Warrior {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;
    private Integer warrior_rank;
    private String registration_date;
    private String last_seen_date;

    @OneToOne(mappedBy = "warrior")
    private User user;
}
