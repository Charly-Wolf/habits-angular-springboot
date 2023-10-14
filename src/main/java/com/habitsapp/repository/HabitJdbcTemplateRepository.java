//package com.habitsapp.repository;
//
//import com.habitsapp.model.Habit;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Repository
//public class HabitJdbcTemplateRepository {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    public HabitJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    private static Habit mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return new Habit(rs.getInt("id"),
//                rs.getString("text"),
//                rs.getBoolean("is_done"),
//                rs.getBoolean("is_archived"));
//    }
//
//    public List<Habit> getAllHabits() {
//        String sql = "SELECT * FROM Habits";
//        return jdbcTemplate.query(sql, HabitJdbcTemplateRepository::mapRow);
//    }
//
//    public void createHabit(String text, Boolean isDone, Boolean isArchived) {
//        String sql = "INSERT INTO Habits (text, is_done, is_archived) VALUES (?, ?, ?)";
//        jdbcTemplate.update(sql, text, isDone, isArchived);
//    }
//
//    public void updateHabit(int id, String text, Boolean isDone, Boolean isArchived) {
//        String sql = "UPDATE Habits SET text=?, is_done=?, is_archived=?";
//        jdbcTemplate.update(sql, text, isDone, isArchived, id);
//    }
//
//    public void deleteHabit(int id) {
//        String sql = "DELETE FROM Habits WHERE id=?";
//        jdbcTemplate.update(sql, id);
//    }
//
//    public Habit getHabit(int id) {
//        String sql = "SELECT * FROM Habits WHERE id=?";
//        return jdbcTemplate.queryForObject(sql, new Object[]{id}, HabitJdbcTemplateRepository::mapRow);
//    }
//}
