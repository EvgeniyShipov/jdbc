package ru.sbt;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import static java.sql.DriverManager.getConnection;


public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = getConnection("jdbc:h2:~/test", "admin", "secret")) {

            createTable(connection);

            StudentDaoImpl student = new StudentDaoImpl(connection);
            LessonDaoImpl lesson = new LessonDaoImpl(connection);

            student.savePerson(new Student(1, "Alex", "Black"));
            student.savePerson(new Student(2, "Bob", "White"));
            student.savePerson(new Student(3, "Sara", "Connor"));

            lesson.addLesson(new Lesson(1, "C++", new Date()));
            lesson.addLesson(new Lesson(2, "Objective C", new Date()));
            lesson.addLesson(new Lesson(3, "Java", new Date()));
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        connection.createStatement().executeUpdate("CREATE TABLE Students" +
                "(" +
                "id int," +
                "firstName varchar(255)," +
                "lastName varchar(255)," +
                "primary key(id)" +
                ");");

        connection.createStatement().executeUpdate("CREATE TABLE Lessons" +
                "(" +
                "id int," +
                "lessonName varchar(255)," +
                "date date," +
                "primary key(id)" +
                ");");

        connection.createStatement().executeUpdate("CREATE TABLE Student_visits" +
                "(" +
                "student_id int," +
                "lesson_id int," +
                ");");

    }
}
