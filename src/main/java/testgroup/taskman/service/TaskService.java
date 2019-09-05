package testgroup.taskman.service;

import testgroup.taskman.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> allTasks();

    void add(Task task);

    void delete(Task task);

    void edit(Task task);

    Task getById(int id);
}
