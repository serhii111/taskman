package testgroup.taskman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testgroup.taskman.dao.TaskDAO;
import testgroup.taskman.model.Task;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO;

    @Autowired
    public void setTaskDAO(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

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
