package am.aca.Exam.Repository.Interface;

import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.User;

/**
 * Created by Armen on 9/6/2016.
 */
public interface UserRepository {
    User addUser(User user)throws InvalidCommandException;
    User editUser(User user) throws  InvalidCommandException;
    void deleteUser(Integer id) throws  InvalidCommandException;
    User getUser(Integer id)throws  InvalidCommandException; // useri tvyalner@
}
