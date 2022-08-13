package com.noirix.homework3.util;

import com.noirix.homework3.domain.User;

import java.util.ArrayList;
import java.util.Random;

public class UserUtil {

    public static User userGenerate() {
        User user = new User();
        user.setId(idGenerate());
        user.setName(nameGenerate());
        user.setSurname(surnameGenerate());
        user.setFriends(friendsGenerate(2));
        return user;
    }


    public static int idGenerate() {
        Random random = new Random();
        int i = random.nextInt();
        return i;
    }

    private static String nameGenerate() {
        String[] arrayName = {"Андрей", "Борис", "Владимир", "Геннадий", "Дмитрий", "Евгений", "Михаил", "Николай", "Сергей", "Тимофей", "Руслан", "Игорь"};
        Random random = new Random();
        int n = random.nextInt(arrayName.length);
        return arrayName[n];
    }

    private static String surnameGenerate() {
        String[] arraySurname = {"Фамилия1", "Фамилия2", "Фамилия3", "Фамилия4", "Фамилия5", "Фамилия6", "Фамилия7", "Фамилия8", "Фамилия9"};
        Random random = new Random();
        int n = random.nextInt(arraySurname.length);
        return arraySurname[n];
    }


    private static ArrayList<User> friendsGenerate(int friendsCapacity) {
        ArrayList<User> friendsList = new ArrayList<>();
        for (int i = 1; i <= friendsCapacity; i++) {
            User user = new User();
            user.setId(idGenerate());
            user.setName(nameGenerate());
            user.setSurname(surnameGenerate());
            user.setFriends(friendsFriendsGenerate(2));
            friendsList.add(user);
        }
        return friendsList;

    }
    private static ArrayList<User> friendsFriendsGenerate(int friendsFriendCapacity) {
        ArrayList<User> friendsFriendsList = new ArrayList<>();
        for (int i = 1; i <= friendsFriendCapacity; i++) {
            User user = new User();
            user.setId(idGenerate());
            user.setName(nameGenerate());
            user.setSurname(surnameGenerate());
            friendsFriendsList.add(user);
        }
        return friendsFriendsList;

    }
}
