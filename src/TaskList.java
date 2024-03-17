import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> currentTaskList;
    private final ArrayList<Task> completedTaskList;
    private final String name;

    public TaskList(String name){
        this.name = name;
        this.currentTaskList = new ArrayList<>();
        this.completedTaskList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Task> getCurrentTaskList(){
        return currentTaskList;
    }
    public ArrayList<Task> getCompletedTaskList(){
        return completedTaskList;
    }
    public void addCurrentTasks(Task task){
        currentTaskList.add(task);
    }
    public void addCompleteTasks(Task task){
        completedTaskList.add(task);
    }
    public void removeCurrentTask(int index){
        currentTaskList.remove(index);
    }
    public void removeCompletedTask(int index){
        completedTaskList.remove(index);
    }




}