package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1() {
        System.out.println("GroupsOnClass333333中的teacher111");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass333333中的teacher222");
    }
}
