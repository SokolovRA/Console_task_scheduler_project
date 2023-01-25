package task;

import enum1.Type;
import exception.IncorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class MonthlyTask extends Task {

    public MonthlyTask(String title, String deskription, Type type, LocalDateTime dateTime) {
        super(title, deskription, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
      return localDate.isAfter(getDateTime().toLocalDate())
              &&  localDate.getDayOfMonth()==(getDateTime().getDayOfMonth())
              || localDate.isEqual(getDateTime().toLocalDate());
    }
}
