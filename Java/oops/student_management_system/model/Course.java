package com.project.sms.model;

public class Course {

    private String courseId;
    private String courseName;
    private double fee;
    private Teacher teacher;   // Composition: Course HAS a Teacher

    public Course(String courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getFee() {
        return fee;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.assignCourse(this);  // Auto update teacher's course list
    }

    @Override
    public String toString() {
        return courseId + " - " + courseName + " (Fee: " + fee + ")";
    }
}
