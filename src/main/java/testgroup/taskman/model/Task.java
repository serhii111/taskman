package testgroup.taskman.model;

public class Task {
    private int id;
    private String description;
    private int priority;
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

    public String toString(){
    return id + ". " + "\"" + description + "\" " + priority + " " + done;
    }
}
