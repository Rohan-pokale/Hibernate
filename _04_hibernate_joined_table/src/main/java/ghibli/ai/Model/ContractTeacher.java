package ghibli.ai.Model;


import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ContractTeacher extends Teacher {

    private Double ContractAmount;

}
