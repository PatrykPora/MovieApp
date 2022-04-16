package pl.patrykpora.moviecrudapp.controller;


import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykpora.moviecrudapp.model.Movie;
import pl.patrykpora.moviecrudapp.repositorie.MovieRepository;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/test")
    public int test(){
        return 1;
    }

    @GetMapping("/movies")
    public List<Movie> getAll(){
        return movieRepository.getAll();
    }

}
