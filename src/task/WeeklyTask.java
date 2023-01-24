package task;

import enum1.Type;
import exception.IncorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class WeeklyTask extends Task{
    public WeeklyTask(String title, String deskription, Type type, LocalDateTime dateTime) throws IncorrectArgumentException {
        super(title, deskription, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.isEqual(getDateTime().toLocalDate())
                || localDate.isAfter(getDateTime().toLocalDate())
                && localDate.getDayOfWeek().equals(getDateTime().getDayOfWeek());
    }
}
