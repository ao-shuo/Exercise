package com.exercise.lyl.chapter06;

import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Person{
    private String name;
    private Date birthDate;
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

    public Person() {
    }

    public Person(String name, Date birthDate, SimpleDateFormat simpleDateFormat) {
        this.name = name;
        this.birthDate = birthDate;
        this.simpleDateFormat = simpleDateFormat;
    }
}
public class PersonComparator implements Comparable<Person>{
    Collator cmp=Collator.getInstance(Locale.CHINA);
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
