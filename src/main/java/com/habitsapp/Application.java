package com.habitsapp;

import com.habitsapp.model.Habit;
//import com.habitsapp.repository.HabitJdbcTemplateRepository;
import com.habitsapp.repository.HabitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(HabitRepository repository) {
		return args -> {
			// DB Mock Data
			ArrayList<Habit> demoHabits = new ArrayList<Habit>();

			Habit habit1 = new Habit(null,
					"Learn Spring Boot",
					false,
					false);
			demoHabits.add(habit1);
			Habit habit2 = new Habit(null,
					"Learn Angular",
					true,
					false);
			demoHabits.add(habit2);
			Habit habit3 = new Habit(null,
					"Workout",
					false,
					false);
			demoHabits.add(habit3);
			Habit habit4 = new Habit(null,
					"Read a book",
					false,
					false);
			demoHabits.add(habit4);
			Habit habit5 = new Habit(null,
					"Meditate",
					false,
					false);
			demoHabits.add(habit5);
			Habit habit6 = new Habit(null,
					"Old Habit",
					false,
					true);
			demoHabits.add(habit6);

			demoHabits.forEach(repository::save);
		};
	}

}
