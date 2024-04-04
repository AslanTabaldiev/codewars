package codewars.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;
    private String name;
    private String description;
    private Integer rank;
    private Integer completion_times;
    private Integer bookmark;
    private String tags;

}
