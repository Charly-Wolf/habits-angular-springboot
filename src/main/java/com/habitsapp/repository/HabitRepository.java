package com.habitsapp.repository;

import com.habitsapp.model.Habit;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface HabitRepository extends ListCrudRepository<Habit, Integer> {

    List<Habit> findAllByTextContains(String keyword);

}

