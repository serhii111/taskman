package testgroup.taskman.model;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    private String description;

    @Column()
    private int priority;

    @Column()
    private boolean done;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean done() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String toString() {
        return id + ". " + "\"" + description + "\" " + priority + " " + done;
    }
}
