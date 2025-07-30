package ghibli.ai.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int TeacherId;
    private String name;
    private double salary;

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Address> addresses=new ArrayList<>();

}
