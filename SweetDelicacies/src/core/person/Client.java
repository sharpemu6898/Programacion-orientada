
package core.person;

import core.sweetdelicacies.Invoice;
import core.sweetdelicacies.SweetDelicacies;
import java.util.ArrayList;

public class Client extends Person{
    
    private String address;
    private SweetDelicacies sweetDelicacies;
    private ArrayList<Invoice> invoices;
    
     public Client(int id, String nombre, String address) {
        super(id, nombre);
        this.address = address;
        this.sweetDelicacies = null;
        this.invoices = new ArrayList<>();
    }

    public void setSweetDelicacies(SweetDelicacies sweetDelicacies) {
        this.sweetDelicacies = sweetDelicacies;
    }
}
