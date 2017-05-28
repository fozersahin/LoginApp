package Models;

/**
 * Created by fozersahin on 7.5.2017.
 */

public class UserLogin {
    private String username ;
    private String password ;
    private String userId ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserLogin(String username , String password, String userId){
        setPassword(password);
        setUsername(username);
        setUserId(userId);
    }

}
