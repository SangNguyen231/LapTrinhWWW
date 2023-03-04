package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.entities.User;
import vn.edu.iuh.fit.repositories.GeneralRepository;

import java.util.List;

public class UserService {
    //    private UserRepository repository;
    private GeneralRepository<User, Long> gRepository;

    public UserService() {
//        repository = new UserRepository();
        gRepository = new GeneralRepository<>("User");
    }

    public User save(User user) {
        return gRepository.save(user);
    }

    public List<User> findAll() {
        return gRepository.findAll();
    }

//    public User findById(long userid) {
//        return gRepository.findById(userid);
//    }

    public User findById(User user, long userid) {
        return gRepository.findByEntity(user, userid);
    }

    public User updateUser(User user) {
        return gRepository.update(user);
    }

    public User deleteUser(User user, long id) {
        return gRepository.delete(user, id);
    }
}
