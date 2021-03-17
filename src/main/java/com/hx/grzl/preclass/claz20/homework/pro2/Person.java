package com.hx.grzl.preclass.claz20.homework.pro2;

/**
 2.	定义一个性别枚举类，包含男女两种性别。

     定义一个父类Person，包含姓名和性别两个属性。

     定义两个子类Man、Woman。

     编写测试类对两个子类进行实例化，并打印实例信息。
 **/
public class Person {
    private String name;
    private int age;
    private String birthday;
    private Enum sex;
    public String getName() {
        return name;
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
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public Enum getSex() {
        return sex;
    }
    public void setSex(Enum sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", birthday=" + birthday + ", sex=" + sex + "]";
    }
    public Person(String name, int age, String birthday, Enum sex) {
        super();
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.sex = sex;
    }
    public Person() {
        super();
    }
}

enum Sex {
    MALE,FEMALE;
}

class TestPerson{
    public static void main(String[] args) {
        //此时性别只能取--sex.女或sex.男
        Person person=new Person("张三", 18, "9月3日", Sex.MALE);
        System.out.println(person);
        person.setSex(Sex.FEMALE);
        System.out.println(person);
    }
}