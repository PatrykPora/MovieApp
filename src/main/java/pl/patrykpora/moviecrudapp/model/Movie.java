package pl.patrykpora.moviecrudapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    private int id;
    private String name;
    private int rating;

}
