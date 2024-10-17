
package core.person;

import core.sweetdelicacies.SweetDelicacies;
import core.sweetdelicacies.task.Task;
import core.sweetdelicacies.utils.Area;
import java.util.ArrayList;

public class Employee extends Person{
    
    private String position;
    private int aging;
    private Area area;
    private SweetDelicacies sweetDelicacies;
    private ArrayList<Task> tasks;

    public Employee(int id, String name, String position, int aging, Area area) {
        super(id, name);
        this.position = position;
        this.aging = aging;
        this.area = area;
        this.sweetDelicacies = null;
        this.tasks = new ArrayList<>();
    }
    
    public void setSweetDelicacies(SweetDelicacies sweetDelicacies) {
        this.sweetDelicacies = sweetDelicacies;
    }
    
    public boolean addTask(Task taks) {
        if (!this.tasks.contains(taks)){
            this.tasks.add(taks);
            return true;
        }
        return false;
    }
    
}