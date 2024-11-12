package placement.projectwithspringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import placement.projectwithspringboot.Entity.UserData;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<UserData,Integer> {

    // here  manually define custom methods;
    public List<UserData> findByname(String name) ;
    Optional<UserData> findByEmail(String email);

}
