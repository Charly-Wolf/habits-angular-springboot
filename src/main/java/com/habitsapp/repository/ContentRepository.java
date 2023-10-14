package com.habitsapp.repository;

import com.habitsapp.model.Habit;
import com.habitsapp.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Habit, Integer> {

    List<Habit> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content
            WHERE status = :status
            """)
    List<Habit> listByStatus(@Param("status") Status status);
}
