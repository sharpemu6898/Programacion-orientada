
package core.person;

import core.sweetdelicacies.SweetDelicacies;
import core.sweetdelicacies.task.Task;
import core.sweetdelicacies.utils.Area;
import java.util.ArrayList;

public class Employee extends Person{
    
    private String position;
    private int aging;
    private Area area;
    private SweetDelicacies sweetdelicacies;
    private ArrayList<Task> tasks;

    public Employee(int id, String name, String position, int aging, Area area) {
        super(id, name);
    }
}

new Employee(200200000, "Hildefons Abioye", "Production Manager", 12, Area.PRODUCTION)