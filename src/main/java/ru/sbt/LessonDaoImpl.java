package ru.sbt;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class LessonDaoImpl implements LessonDao {
    private final Connection connection;

    public LessonDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addLesson(Lesson lesson) {
        try {
            PreparedStatement statement = connection.prepareStatement("insert into Lessons (id, lessonName, date) values(?, ?, ?)");

            statement.setLong(1, lesson.getId());
            statement.setString(2, lesson.getLessonName());
            statement.setDate(3, new Date(lesson.getLessonDate().getTime()));
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Lesson findById(long id) {
        return null;
    }

    @Override
    public List<Lesson> findByLessonName(String lessonName) {
        return null;
    }

    @Override
    public List<Student> studentsOnLesson(Student student) {
        return null;
    }
}
