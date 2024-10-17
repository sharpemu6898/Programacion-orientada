package core.sweetdelicacies.product;

import java.time.LocalDate;

public class Chocolate extends Product{
    
    double cocoaPercentage;
    String fillingType;
    
    public Chocolate(String name, double weight, double unitPrice, LocalDate fabricationDate, double cocoaPercentage, String fillingType) {
        super(name, weight, unitPrice, fabricationDate);
        this.cocoaPercentage = cocoaPercentage;
        this.fillingType = fillingType;
    }

    

}
