package th.mfu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.mfu.Domain.User;
import th.mfu.Model.LoginModel;
import th.mfu.Repository.UserRepository;

@Service
public class LoginService {
    @Autowired
    UserRepository userRepository;

    public LoginModel login(String username, String password) {
        User userLogin = userRepository.findByUsernameAndPassword(username, password);
        LoginModel loginModel = new LoginModel();
        loginModel.setId(userLogin.getId());
        loginModel.setUsername(userLogin.getUsername());
        loginModel.setPassword(userLogin.getPassword());
        return loginModel;
    }
}
