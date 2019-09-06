package testgroup.taskman.dao;

import org.springframework.stereotype.Repository;
import testgroup.taskman.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class TaskDAOImpl implements TaskDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(1);
    private static Map<Integer, Task> tasks = new HashMap<>();

    static {
        Task task1 = new Task();
        task1.setId(AUTO_ID.getAndIncrement());
        task1.setDescription("To learn Java");
        task1.setPriority(2);
        task1.setDone(false);
        tasks.put(task1.getId(), task1);

        Task task2 = new Task();
        task2.setId(AUTO_ID.getAndIncrement());
        task2.setDescription("To buy gasoline");
        task2.setPriority(1);
        task2.setDone(true);
        tasks.put(task2.getId(), task2);

        Task task3 = new Task();
        task3.setId(AUTO_ID.getAndIncrement());
        task3.setDescription("To learn Spring");
        task3.setPriority(1);
        task3.setDone(true);
        tasks.put(task3.getId(), task3);
    }

    public List<Task> allTasks() {
        return new ArrayList<>(tasks.values());
    }

    public void add(Task task) {
        task.setId(AUTO_ID.getAndIncrement());
        tasks.put(task.getId(), task);
    }

    public void delete(Task task) {
        tasks.remove(task.getId());
    }

    public void edit(Task task) {
        tasks.put(task.getId(), task);
    }

    public Task getById(int id) {
        return tasks.get(id);
    }
}
