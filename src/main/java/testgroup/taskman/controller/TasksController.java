package testgroup.taskman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.taskman.model.Task;
import testgroup.taskman.service.TaskService;
import testgroup.taskman.service.TaskServiceImpl;

import java.util.List;

@Controller
public class TasksController {

    private TaskService taskService = new TaskServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allTasks() {
        List<Task> tasks = taskService.allTasks();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tasksPage");
        modelAndView.addObject("tasks", tasks);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}
