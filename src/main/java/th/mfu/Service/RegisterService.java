package th.mfu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.mfu.Domain.User;
import th.mfu.Repository.UserRepository;

@Service
public class RegisterService {
    @Autowired
    UserRepository userRepository;
    public void register(String username,String password,String name){
        try {
            User regisUser = new User();
            regisUser.setUsername(username);
            regisUser.setPassword(password);
            regisUser.setName(name);
            userRepository.save(regisUser);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
