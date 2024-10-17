
package core.sweetdelicacies.task;

import java.time.LocalDate;

public class Task {
    
    private static int ID = 0;
    
    private int id;
    private LocalDate date;
    private int duration;

    public Task(LocalDate date, int duration) {
        this.id = Task.ID;
        this.date = date;
        this.duration = duration;
        
        //ID autoincremental
        Task.ID++;
    }
}

