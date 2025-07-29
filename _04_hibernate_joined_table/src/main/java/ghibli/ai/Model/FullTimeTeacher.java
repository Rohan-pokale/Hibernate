package ghibli.ai.Model;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class FullTimeTeacher extends Teacher {

    private double salary;

}
