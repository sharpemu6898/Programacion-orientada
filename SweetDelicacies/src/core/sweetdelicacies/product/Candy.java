package core.sweetdelicacies.product;

import java.time.LocalDate;

public class Candy extends Product{
    
    private String flavor;
    private String wrapperType;
    
    public Candy(String name, double weight, double unitPrice, LocalDate fabricationDate, String flavor, String wrapperType) {
        super(name, weight, unitPrice, fabricationDate);
        this.flavor = flavor;
        this.wrapperType = wrapperType;
    }
}
        
