package com.habitsapp.controller;

import com.habitsapp.model.Habit;
import com.habitsapp.repository.HabitRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/habit")
@CrossOrigin
public class HabitController {

    private final HabitRepository repository;

    public HabitController(HabitRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public List<Habit> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Habit findById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Content not found!"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@Valid @RequestBody Habit habit) {
        repository.save(habit);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Habit habit, @PathVariable Integer id) {
        if(!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Habit not found!");
        }
        repository.save(habit);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
;    }

    @GetMapping("/filter/{keyword}")
    public List<Habit> findByTitle(@PathVariable String keyword) {
        return repository.findAllByTextContains(keyword);
    }

//    @GetMapping("/filter/status/{status}")
//    public List<Habit> findByStatus(@PathVariable Status status) {
//        return repository.listByStatus(status);
//    }

}
