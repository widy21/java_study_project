package com.hx.hxdemo.practice.designmoudle;

/**
 * builder 模式
 * 优点：当需要构造的参数越来越多时，不需要再定义多个构造器。
 */
public class Contact {

    String name;
    String address;
    String phoneNo;

    private Contact(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.phoneNo = builder.phoneNo;
    }

    @Override
    public String toString() {
        return String.format("name is: %s\naddress is: %s\nphone is: %s\n",this.name,this.address,this.phoneNo);
    }

    public static class Builder {

        String name;
        String address;
        String phoneNo;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String adr) {
            this.address = adr;
            return this;
        }

        public Builder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }

    public static void main(String[] args) {
        Contact con = new Contact.Builder()
                .address("beijing")
                .name("aaa")
//                .phoneNo("12811283828")
                .build();
        System.out.println(con);
    }
}

