public class LoginService {

    public boolean login(String username, String password) {
        if(username.equals("admin") && password.equals("1234")) {
            return false; 
        }
        return false;
    }
}
