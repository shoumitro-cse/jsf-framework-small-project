import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  
//import javax.validation.constraints.NotNull;  

@ManagedBean(name = "u")
@RequestScoped  
public class User {  

    //@NotNull(message = "Name can't be null")  
    String name;  
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {  
    return name;  
    }  
    public void setName(String name) {  
    this.name = name;  
    }  
}  