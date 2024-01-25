package service;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static Map<String, User> users = new HashMap<>();
    private static Map<String, User> loggedInUsers = new HashMap<>();
    //Регистрация пользователя.
    static void registerUser (String username,String password){
        if (!users.containsKey(username)){
            users.put(username,new User(username,password));
            System.out.println("Вы успешно зарегистрировались!");
        }else {
            System.out.println("Извините, но пользователь с таким именем уже зарегистрирован. Пожалуйста попробуйте снова");
        }
    }
    static void loginUser(String username, String password){
        if(users.containsKey(username) && users.get(username).getPassword().equals(password)){
            loggedInUsers.put(username,users.get(username));
            System.out.println("Авторизация прошла успешно!");
        }else {
            System.out.println("Ошибка авторизации. Пожалуйста попробуйте снова");
        }
    }

}
