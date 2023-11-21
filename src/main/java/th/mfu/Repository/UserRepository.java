package th.mfu.Repository;

import org.springframework.stereotype.Repository;
import th.mfu.Domain.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUsernameAndPassword(String username ,String password);
}