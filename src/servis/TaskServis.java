package servis;
import exception.TaskNotFoundException;
import task.Task;

import java.time.LocalDate;
import java.util.*;
public class TaskServis {
    private final Map<Integer, Task> taskMap;
    private final Collection<Task> removedTask;

    public TaskServis() {
        this.taskMap = new HashMap<>();
        this.removedTask = new ArrayList<>();
    }

    public void add(Task task) {
        taskMap.put(task.getId(), task);

    }

    public Task remove(int id)  {
        if (taskMap.containsKey(id)) {
            Task task1 = taskMap.get(id);
            removedTask.add(task1);
            taskMap.remove(id);
            return task1;
        } else {
            throw new TaskNotFoundException();
        }
    }

    public Collection<Task> getAllByDate(LocalDate localDate) {
        Collection<Task> result = new ArrayList<>();
        for (Map.Entry<Integer, Task> entry : taskMap.entrySet()) {
            if (entry.getValue().appearsIn(localDate)) {
                result.add(entry.getValue());
            }
        }
        return result;
    }
}
