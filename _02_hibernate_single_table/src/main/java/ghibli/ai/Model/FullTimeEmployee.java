package ghibli.ai.Model;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue("ftemployee")
//@DiscriminatorColumn(name = "Discriminator")
public class FullTimeEmployee extends Employee {

    private double salary;

}
