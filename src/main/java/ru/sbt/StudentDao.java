package ru.sbt;


import java.util.List;

public interface StudentDao {
    void savePerson(Student student);

    Student findById(long id);

    List<Student> findByName(String name);

    List<Lesson> attendLessons(Lesson lesson);
}
