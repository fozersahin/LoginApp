package Adapter;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Models.User;
import Models.UserLogin;

/**
 * Created by fozersahin on 7.5.2017.
 */

public class UserAdapter {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference usersRef = database.getReference("Users");

    DatabaseReference loginRef = database.getReference("UserLogin");
    public UserAdapter(){};

    public void CreateUser(User user , UserLogin userLogin){

        user.setId(usersRef.push().getKey());
        usersRef.child(user.getId()).setValue(user);
        userLogin.setUserId(user.getId());
        loginRef.child(user.getId()).setValue(userLogin);

    };
    public void UpdateUser(){};
    public void DeleteUser(String UserId){
        User user = FindUser(UserId);
        //loginRef.

    };
    public User FindUser(String userId){


        return null;
    };

}
