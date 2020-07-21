package com.hx.grzl.class2;

import java.util.*;

/**
 * 课后习题18、实现一个简单的单词本
 * - 功能：
 * - 可以添加单词和词义，当所添加的单词已存在，让用户知道；
 * - 可以查找单词，当查找的单词不存在时，让用户知道；
 * - 可以删除单词，当删除的单词不存在时，让用户知道；
 * - 以上功能可以无限制操作，直到用户输入bye退出程序。
 **/
public class HomeWorkNo18 {
    public static void main(String[] args) {
        String info = "add: add the word and word mean \n" +
                "find: find the word \n" +
                "del : delete the word\n" +
                "all : show all word\n" +
                "bye :quit the program \n";
        System.out.println(info);

        Map wordListDict = new HashMap<>();
        while (true) {
            System.out.println("please input the command:");
            Scanner sc = new Scanner(System.in);
            String command = new String();
            command = sc.nextLine();
//            System.out.println("command: " + command);
            if (command.equals("add")) {
                System.out.println("please input the word:");
                Scanner sc1 = new Scanner(System.in);
                String word = new String();
                word = sc1.nextLine();
                if (wordListDict.containsKey(word)) {
                    System.out.println("alreay exists");
                } else {
                    System.out.println("input the word mean: ");
                    Scanner sc2 = new Scanner(System.in);
                    String wordMean = new String();
                    wordMean = sc2.nextLine();
                    wordListDict.put(word, wordMean);
                }
            } else if (command.equals("find")) {
                System.out.println("please input the word:");
                Scanner sc3 = new Scanner(System.in);
                String word = new String();
                word = sc3.nextLine();
                if (wordListDict.containsKey(word)) {
                    System.out.println(wordListDict.get(word));
                } else {
                    System.out.println("not exists");
                }

            } else if (command.equals("del")) {
                System.out.println("please input the word:");
                Scanner sc3 = new Scanner(System.in);
                String word = new String();
                word = sc3.nextLine();
                if (wordListDict.containsKey(word)) {
                    wordListDict.remove(word);
                    System.out.println("delete success.");
                } else {
                    System.out.println("not exists");
                }
            } else if (command.equals("all")) {
                System.out.println("current words are: \n"+ wordListDict);
            }else if (command.equals("bye")) {
                System.out.println("see you~");
                break;
            }else {
                System.out.println("please input the right command.");
            }
        }
    }
}
