package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob // Thus allowing this field to store more than the 250 characters limit for a String (usually) in a DB
    private String recipeNotes;

}
