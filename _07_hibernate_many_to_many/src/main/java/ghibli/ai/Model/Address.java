package ghibli.ai.Model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int AddId;
  private int zip;
  private String city;
  private String street;
  private String country;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "TeacherId")
  private Teacher teacher;

}
