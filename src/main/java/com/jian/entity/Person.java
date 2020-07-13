package com.jian.entity;

/**
 * @Author: qtj
 * @Date: 2020/7/1 14:22
 * @Version
 */
public class Person {

    private String name;
    private int  age;
    private int number;
    private Address address;

    public Person() {

    }
    public Person(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "name:"+name+"\nage:"+age+ "\nnumber:"+number + "\naddress:" ;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
