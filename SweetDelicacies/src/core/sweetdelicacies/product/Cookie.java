package core.sweetdelicacies.product;

import java.time.LocalDate;

public class Cookie extends Product{
    
    String fluorType;
    String chips;
    
    public Cookie(String name, double weight, double unitPrice, LocalDate fabricationDate, String fluorType, String chips) {
        super(name, weight, unitPrice, fabricationDate);
        this.fluorType = fluorType;
        this.chips = chips;
    }

    


}
