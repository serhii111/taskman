package testgroup.taskman.service;

import testgroup.taskman.dao.TaskDAO;
import testgroup.taskman.dao.TaskDAOImpl;
import testgroup.taskman.model.Task;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO = new TaskDAOImpl();


    public List<Task> allTasks() {
        return taskDAO.allTasks();
    }

    public void add(Task task) {
        taskDAO.add(task);
    }

    public void delete(Task task) {
        taskDAO.delete(task);
    }

    public void edit(Task task) {
        taskDAO.edit(task);
    }

    public Task getById(int id) {
        return taskDAO.getById(id);
    }
}
