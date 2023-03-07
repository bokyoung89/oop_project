package org.example;

import org.example.gradeCalculate.Course;

import java.util.List;

public class Courses {
    // 일급 컬렉션이란? 자료구조 형태로 된 정보만 인스턴스 변수로 가지는 클래스
    // 따라서 정보를 가진 메서드가 일급 컬렉션 안으로 들어오게 됨.
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
/*        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }
        return multipliedCreditAndCourseGrade;*/
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();

    }
}
