package arkham.knight.practica12.spring.services;

import arkham.knight.practica12.spring.models.User;
import arkham.knight.practica12.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void createUser(User user){

        userRepository.save(user);
    }

    public List<User> listAllUsers(){

        return userRepository.findAll();
    }

    public User findUserById(long id){

        return userRepository.findUserById(id);
    }


    public void deleteUser(User user){

        userRepository.delete(user);
    }
}
