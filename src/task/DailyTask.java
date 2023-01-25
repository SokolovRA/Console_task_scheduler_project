package task;

import enum1.Type;
import exception.IncorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task{
    public DailyTask(String title, String deskription, Type type, LocalDateTime dateTime)  {
        super(title, deskription, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.isAfter(getDateTime().toLocalDate()) || localDate.isEqual(getDateTime().toLocalDate());
    }
}
