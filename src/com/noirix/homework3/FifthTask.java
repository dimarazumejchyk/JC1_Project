package com.noirix.homework3;

import com.noirix.homework3.domain.User;
import com.noirix.homework3.util.UserUtil;

import java.util.ArrayList;

import static com.noirix.homework3.util.UserUtil.friendsGenerate;
import static com.noirix.homework3.util.UserUtil.printFriendsList;
import static com.noirix.homework3.util.UserUtil.userGenerate;


public class FifthTask {
    public static void main(String[] args) {

            User user = userGenerate();
            System.out.println(user);



            System.out.print(user.getName() + " => ");
            UserUtil.printFriendsList(user.getFriends(friendsGenerate(5)));



    }
}
