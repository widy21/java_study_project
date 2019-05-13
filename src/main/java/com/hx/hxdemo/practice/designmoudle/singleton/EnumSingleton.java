package com.hx.hxdemo.practice.designmoudle.singleton;

public enum EnumSingleton {

    SINGLETON;
    private String objName;

    public void setName(String name) {
        this.objName = name;
    }

    public String getName() {
        return this.objName;
    }

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.SINGLETON;
        singleton1.setName("single1");
        System.out.println(singleton1.getName());
        EnumSingleton singleton2 = EnumSingleton.SINGLETON;
        singleton2.setName("single2");
        System.out.println(singleton1.getName());
        System.out.println(singleton2.getName());

        // 反射
        EnumSingleton[] singletons = EnumSingleton.class.getEnumConstants();
        for (EnumSingleton singleton : singletons){
            System.out.println("---反射---\n"+singleton.getName());
        }
    }
}
