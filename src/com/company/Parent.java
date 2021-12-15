package com.company;

public class Parent {
    private String name;
    private String phoneNum;

    public Parent(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public boolean isEqual(Parent p) {
        return (this.phoneNum.equals(p.getPhoneNum()) &&
                this.name.equals(p.getName()));
    }

    @Override
    public String toString() {
        return "your daday or mamay are :" +
                "name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '.';
    }
}
