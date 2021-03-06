import java.util.Date;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  

@ManagedBean(name = "user")  
@RequestScoped  
public class User {  
    
    String name;  
    Integer age;  
    Date dob;  
    int shirtCost;

    public int getShirtCost() {
        return shirtCost;
    }

    public void setShirtCost(int shirtCost) {
        this.shirtCost = shirtCost;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public String getName() {  
    return name;  
    }  
    public void setName(String name) {  
    this.name = name;  
    }  
    public Integer getAge() {  
    return age;  
    }  
    public void setAge(Integer age) {  
    this.age = age;  
    }
    
    public String submit(){
        return "response.xhtml";
    }
}    