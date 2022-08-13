package com.noirix.homework3;

import com.noirix.homework3.domain.User;
import com.noirix.homework3.util.PrintUtil;
import com.noirix.homework3.util.UserUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FifthTask {
    public static void main(String[] args) {

        List listUser = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            listUser.add(UserUtil.userGenerate());
            listUser.indexOf(i);
        }
        for (Object user : listUser) {
        }

       //  listUser.sort();



      /*  User user0 = UserUtil.userGenerate();
        listUser.add(user0);
        User user1 = UserUtil.userGenerate();
        listUser.add(user1);
        User user2 = UserUtil.userGenerate();
        listUser.add(user2);


        String[] name = new String[] {user0.getName(), user1.getName(), user2.getName()};
        System.out.println(Arrays.toString(name));

        */
        System.out.println("listUser size " + listUser.size());

       // System.out.println(user2);
       // System.out.println(user2.getName() + " => " + listUser.get(2));


    }
}
