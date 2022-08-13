package com.noirix.homework3;

import com.noirix.homework3.domain.Student;
import com.noirix.homework3.util.PrintUtil;
import com.noirix.homework3.util.StudentUtil;

import java.util.TreeSet;

public class FourthTask {
    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>();
        int studentQuantity;
        for ( studentQuantity = 0; studentQuantity < 10; studentQuantity++) {
            treeSet.add(StudentUtil.generateStudent());
        }
        System.out.println("treeSet size " + treeSet.size());

        treeSet.removeIf(x -> x.getNumber()%2!=0);

        PrintUtil.print(treeSet);

        System.out.println("treeSet size " + treeSet.size());




































    }
}
