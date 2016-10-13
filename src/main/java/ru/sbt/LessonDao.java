package ru.sbt;


import java.util.List;

public interface LessonDao {
    void addLesson(Lesson math);

    Lesson findById(long id);

    List<Lesson> findByLessonName(String lessonName);

    List<Student> studentsOnLesson(Student student);
}
