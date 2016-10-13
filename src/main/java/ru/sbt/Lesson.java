package ru.sbt;


import java.util.Date;

public class Lesson {
    private final long id;
    private final String lessonName;
    private final Date lessonDate;

    public Lesson(long id, String lessonName, Date lessonDate) {
        this.id = id;
        this.lessonName = lessonName;
        this.lessonDate = lessonDate;
    }

    public long getId() {
        return id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public Date getLessonDate() {
        return lessonDate;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", lectureNAme='" + lessonName + '\'' +
                ", lessonDate=" + lessonDate +
                '}';
    }
}
