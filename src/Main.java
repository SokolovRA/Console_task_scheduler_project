import enum1.Type;
import exception.IncorrectArgumentException;
import exception.TaskNotFoundException;
import servis.TaskServis;
import task.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;


public class Main {
    public static void main(String[] args) throws Exception {

        OneTimeTask oneTimeTask = new OneTimeTask("Тренировка", "Жим лежа, жим в кроссовере", Type.PERSONAL, LocalDateTime.now());
        DailyTask dailyTask = new DailyTask("Для отдела", "Подготовить графики", Type.WORK, LocalDateTime.of(2022,2,2,15,15,00,00));
        WeeklyTask weeklyTask = new WeeklyTask("Директору","Передать отчет",Type.WORK,LocalDateTime.of(2022,2,2,15,15,00,00));
        MonthlyTask monthlyTask = new MonthlyTask("Draiv", "Jamp Pamp", Type.PERSONAL, LocalDateTime.of(2022, 2, 2, 22, 15, 00, 00));
        YearlyTask yearlyTask = new YearlyTask("Поздравление с НГ   ","Поздравить бабушку",Type.PERSONAL,LocalDateTime.of(2023,1,1,00,00,00,00));

        TaskServis taskServis = new TaskServis();
        taskServis.add(oneTimeTask);
        taskServis.add(dailyTask);
        taskServis.add(weeklyTask);
        taskServis.add(monthlyTask);
        taskServis.add(yearlyTask);

        try {
            System.out.println(taskServis.remove(3));
        }catch (TaskNotFoundException e){
            System.out.println("Нельзя удалить!!! Задача отсутствует");
        }

        System.out.println(taskServis.getAllByDate(LocalDate.of(2022,5,2)));


    }
}