package task;

import enum1.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends  Task {
    public OneTimeTask(String title, String deskription, Type type, LocalDateTime dateTime)  {
        super(title, deskription, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.isEqual(getDateTime().toLocalDate());
    }
}
