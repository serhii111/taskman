package testgroup.taskman.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import testgroup.taskman.model.Task;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Task> allTasks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Task").list();
    }

    @Override
    public void add(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(task);
    }

    @Override
    public void delete(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(task);
    }

    @Override
    public void edit(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.update(task);
    }

    @Override
    public Task getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Task.class, id);
    }
}
