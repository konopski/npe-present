package object;

import npe1.stubs.Dao;
import npe1.stubs.User;

public class UserDao extends Dao {

    private static User NULL = new User();
    //....
    public User getById(Long id) {
        User u = em().find(User.class, id);
        if(u == null) {
            return NULL;
        } else {
            return u;
        }
    }

    public static void main(String[] args) {
        User u = new UserDao().getById(997L);
    }

}
