package core.sweetdelicacies.product;

import java.time.LocalDate;

public class Chocolate extends Product{
    
    float cocoaPercentage;
    String fillingType;
    
    public Chocolate(String name, float weight, float unitPrice, LocalDate fabricationDate, float cocoaPercentage, String fillingType) {
        super(name, weight, unitPrice, fabricationDate);
        this.cocoaPercentage = cocoaPercentage;
        this.fillingType = fillingType;
    }

    

}
