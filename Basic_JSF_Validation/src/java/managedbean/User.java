package managedbean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

// configure using faces-config.xml file inside WEB-INF directory
//@ManagedBean(eager = true)
//@RequestScoped
//@ApplicationScoped
//@SessionScoped
//@ViewScoped
//@CustomScoped(value = "Hi")
//@NoneScoped
public class User {

    private String name;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
//

