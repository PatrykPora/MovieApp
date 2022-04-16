package pl.patrykpora.moviecrudapp.controller;


import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.patrykpora.moviecrudapp.model.Movie;
import pl.patrykpora.moviecrudapp.repositorie.MovieRepository;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("")
    public List<Movie> getAll(){
        return movieRepository.getAll();
    }

    @GetMapping("/{id}")
    public Movie getById(@PathVariable("id") int id) {
        return movieRepository.getById(id);
    }

    @PostMapping("")
    public int addMovie(@RequestBody List<Movie> movies){
        return movieRepository.save(movies);
    }

}
