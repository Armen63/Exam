package am.aca.Exam.Repository.Implementation;

import am.aca.Exam.Repository.Interface.UserRepository;
import am.aca.Exam.comman.exception.InvalidCommandException;
import am.aca.Exam.comman.model.User;

/**
 * Created by Armen on 9/6/2016.
 */
public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl instance;
    private UserRepositoryImpl(){

    }
    public static UserRepositoryImpl getInstance(){
        if(instance==null){
            instance=new UserRepositoryImpl();
        }
        return instance;
    }
    @Override
    public User addUser(User user) throws InvalidCommandException {
        return null;
    }

    @Override
    public User editUser(User user) throws InvalidCommandException {
        return null;
    }

    @Override
    public void deleteUser(Integer id) throws InvalidCommandException {

    }

    @Override
    public User getUser(Integer id) throws InvalidCommandException {
        return null;
    }
}
