package service;

import model.MeterReading;
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
    //Подача показаний
    static void submitReading(String username, int month, int year,Map<String, Double> meterValues){
        User user = loggedInUsers.get(username);
        if (user != null){
            MeterReading reading = new MeterReading(month,year);
            reading.getMeterValues().putAll(meterValues);
            user.getReadings().add(reading);
            System.out.println("Данные добавлены успешно");
        }else {
            System.out.println("Вы не авторизованы");
        }
    }

}
