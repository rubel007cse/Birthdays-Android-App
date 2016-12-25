package com.mrubel.birthdays;

/**
 * Created by mosharrofrubel on 12/25/16.
 */

public class DataTemp {

    private int id;
    private String name;
    private String day;


    public DataTemp(String n, String d ){
        name = n;
        day = d;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
