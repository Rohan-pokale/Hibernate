package ghibli.ai.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

    private String title;

    @Column(name = "des")
    private String  description;

    private String Year;

    @ElementCollection
    @Column(name = "Actors")
    private List<String> Actors=new ArrayList<>();

}
