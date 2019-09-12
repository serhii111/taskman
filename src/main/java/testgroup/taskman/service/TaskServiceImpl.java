package testgroup.taskman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testgroup.taskman.dao.TaskDAO;
import testgroup.taskman.model.Task;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskDAO taskDAO;

    @Autowired
    public TaskServiceImpl(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @Transactional
    public List<Task> allTasks() {
        return taskDAO.allTasks();
    }

    @Transactional
    public void add(Task task) {
        taskDAO.add(task);
    }

    @Transactional
    public void delete(Task task) {
        taskDAO.delete(task);
    }

    @Transactional
    public void edit(Task task) {
        taskDAO.edit(task);
    }

    @Transactional
    public Task getById(int id) {
        return taskDAO.getById(id);
    }
}
