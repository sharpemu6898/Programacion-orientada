package core.sweetdelicacies.product;

import java.time.LocalDate;

public class Candy extends Product{
    String flavor;
    String wrapperType;
    public Candy(String name, float weight, float unitPrice, LocalDate fabricationDate, String flavor,
            String wrapperType) {
        super(name, weight, unitPrice, fabricationDate);
        this.flavor = flavor;
        this.wrapperType = wrapperType;
    }
    

}
