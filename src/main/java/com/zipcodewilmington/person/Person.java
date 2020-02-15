package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String hairColor;
    private String sex;
    private String eyeColor;
    private int weight;
    private int height;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String hairColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public Person(String name, int age, String hairColor, String sex){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.sex = sex;
    }

    public Person(String name, int age, String hairColor, String sex, String eyeColor){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.sex = sex;
        this.eyeColor = eyeColor;
    }

    public Person(String name, int age, String hairColor, String sex, String eyeColor, int weight){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public Person(String name, int age, String hairColor, String sex, String eyeColor, int weight, int height){
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }

    public String getHairColor(){

        return hairColor;
    }

    public String getSex(){

        return sex;
    }

    public String getEyeColor(){

        return eyeColor;
    }

    public Integer getWeight() {

        return weight;
    }

    public Integer getHeight() {

        return height;
    }
}
