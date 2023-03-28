package com.here;

import java.util.Date;

final class Person {

    private String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }


}
