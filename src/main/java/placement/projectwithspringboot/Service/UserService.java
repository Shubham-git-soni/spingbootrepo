package placement.projectwithspringboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import placement.projectwithspringboot.Entity.UserData;
import placement.projectwithspringboot.Repository.UserRepo;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserData saveDetails(UserData userData) {
        return userRepo.save(userData);
    }

    public List<UserData> getUserDetailsByname(String name) {
        return userRepo.findByname(name);
    }

    public Optional<UserData> getuserbyemail(String email)
    {
        return userRepo.findByEmail(email) ;
    }

}