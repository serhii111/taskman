package testgroup.taskman.dao;

import testgroup.taskman.model.Task;

import java.util.List;

public interface TaskDAO {

    List<Task> allTasks();

    void add(Task task);

    void delete(Task task);

    void edit(Task task);

    Task getById(int id);
}
