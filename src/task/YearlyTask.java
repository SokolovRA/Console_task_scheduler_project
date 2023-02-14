package task;

import enum1.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {
    public YearlyTask(String title, String deskription, Type type, LocalDateTime dateTime)  {
        super(title, deskription, type, dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.isEqual(getDateTime().toLocalDate())
                || localDate.isAfter(getDateTime().toLocalDate())
                && localDate.getDayOfMonth()==getDateTime().getDayOfMonth()
                && localDate.getMonthValue()==getDateTime().getMonthValue();
    }
}
