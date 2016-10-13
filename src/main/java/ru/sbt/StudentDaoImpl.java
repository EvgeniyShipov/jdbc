package ru.sbt;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private final Connection connection;

    public StudentDaoImpl(Connection connection1) {
        this.connection = connection1;
    }

    @Override
    public void savePerson(Student student) {
        try {
            PreparedStatement statement = connection.prepareStatement("insert into Students (id, firstName, lastName) values(?, ?, ?)");

            statement.setLong(1, student.getId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }

    @Override
    public List<Lesson> attendLessons(Lesson lesson) {
        return null;
    }

}
