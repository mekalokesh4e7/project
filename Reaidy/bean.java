package login.bean;
import java.io.Serializable;

public class bean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    
    

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getUsername() {
		return username;
	}
}
