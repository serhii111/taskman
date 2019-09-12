package testgroup.taskman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import testgroup.taskman.model.Task;
import testgroup.taskman.service.TaskService;

import java.util.List;

@Controller
public class TasksController {

    private TaskService taskService;

    @Autowired
    TasksController(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView allTasks(ModelAndView modelAndView) {
        List<Task> tasks = taskService.allTasks();
        modelAndView.setViewName("tasksPage");
        modelAndView.addObject("tasks", tasks);
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id, ModelAndView modelAndView) {
        Task task = taskService.getById(id);
        modelAndView.setViewName("editPage");
        modelAndView.addObject("task", task);
        modelAndView.addObject("task", taskService.getById(id));
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editTask(@ModelAttribute("task") Task task, ModelAndView modelAndView) {
        modelAndView.setViewName("redirect:/");
        taskService.edit(task);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage(ModelAndView modelAndView) {
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addTask(@ModelAttribute("task") Task task, ModelAndView modelAndView) {
        modelAndView.setViewName("redirect:/");
        taskService.add(task);
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteTask(@PathVariable("id") int id, ModelAndView modelAndView) {
        modelAndView.setViewName("redirect:/");
        Task task = taskService.getById(id);
        taskService.delete(task);
        return modelAndView;
    }
}
