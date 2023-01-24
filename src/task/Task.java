package task;

import enum1.Type;
import exception.IncorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {
    private String title;
    private final Type type;
    private final int id;
    private static int idGenerator;
    private final LocalDateTime dateTime;
    private String deskription;


    public Task(String title, String deskription, Type type, LocalDateTime dateTime) throws IncorrectArgumentException {
        setTitle(title);
        setDeskription(deskription);
        this.title = title;
        this.type = type;
        this.id = ++idGenerator;
        this.dateTime = dateTime;
        this.deskription = deskription;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDeskription() {
        return deskription;
    }

    public void setTitle(String title)throws IncorrectArgumentException {
        if (title != null && !title.isBlank() && !title.isEmpty()) {
            this.title = title;
        } else {
                throw new IncorrectArgumentException(" Некорректный ввод ",title);
            }
        }
    public void setDeskription(String deskription) throws IncorrectArgumentException {
        if (deskription != null && !deskription.isBlank() && !deskription.isEmpty()) {
            this.deskription = deskription;
        } else {
            throw new IncorrectArgumentException(" Некорректный ввод ",deskription);
        }
    }

    public abstract boolean appearsIn(LocalDate localDate) ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && type == task.type && Objects.equals(dateTime, task.dateTime) && Objects.equals(deskription, task.deskription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, id, dateTime, deskription);
    }

    @Override
    public String toString() {
        return "Задача №(id) "+ id+
                ", Название: " + title +
                ", тип: " + type +
                ", время создания:" + dateTime +
                ", описание: " + deskription+ " \n ";
    }
}
