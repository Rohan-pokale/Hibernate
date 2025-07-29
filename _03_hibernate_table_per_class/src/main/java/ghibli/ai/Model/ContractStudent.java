package ghibli.ai.Model;


import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ContractStudent extends Student {

    private String grade;

}
