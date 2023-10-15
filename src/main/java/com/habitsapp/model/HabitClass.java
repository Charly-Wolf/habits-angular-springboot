//package com.habitsapp.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.validation.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//
////@Entity
//public class HabitClass {
//    @Id
//    @GeneratedValue
//    private Integer id;
//    @NotBlank
//    private String habitText;
//    private Boolean isDone;
//    private Boolean isArchived;
//
//    public HabitClass() {
//    }
//
//    public HabitClass(String habitText) {
//        this.habitText = habitText;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getHabitText() {
//        return habitText;
//    }
//
//    public void setHabitText(String habitText) {
//        this.habitText = habitText;
//    }
//
//    public Boolean getDone() {
//        return isDone;
//    }
//
//    public void setDone(Boolean done) {
//        isDone = done;
//    }
//
//    public Boolean getArchived() {
//        return isArchived;
//    }
//
//    public void setArchived(Boolean archived) {
//        isArchived = archived;
//    }
//
//    @Override
//    public String toString() {
//        return "HabitClass{" +
//                "id=" + id +
//                ", habitText='" + habitText + '\'' +
//                ", isDone=" + isDone +
//                ", isArchived=" + isArchived +
//                '}';
//    }
//}
