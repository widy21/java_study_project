package com.hx.grzl.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @description:
 * 4、创建公司类和员工类、员工包含姓名和KPI等级（A、B、C、D）属性，
 * 公司类包含创建员工方法，通过此方法创建100个员工，并随机分配KPI等级。
 * 根据KPI等级排序并输出员工信息。
 *
 * @author: ethan
 * @create: 2021-01-11 16:41
 **/
public class Company {
    public Employee[] createEmployees(int num){
        Employee[] employees = new Employee[num];
        //todo 难点，随机指定kpi和姓名
        char[] kpiArr = new char[]{'A', 'B', 'C', 'D'};
        String[] nameArr = new String[]{"tom","jack","ethan","allen"};
        for (int i = 0; i < employees.length; i++) {
            int randomIndex = new Random().nextInt(4);
//            System.out.println(randomIndex);
            employees[i] = new Employee(nameArr[randomIndex]+i, kpiArr[randomIndex]);
//            System.out.println(employees[i]);
        }
        return employees;
    }

    public void printEmployeeInfo(Employee[] employees){
        //todo 使用工具类打印
        System.out.println(Arrays.toString(employees));
    }

    public void sortEmployeeInfo(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
//            Employee employee = employees[i];
            for (int j = 0; j < employees.length-i-1; j++) {
                if(employees[j].getKpi()>employees[j+1].getKpi()){
                    Employee temp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employees = company.createEmployees(10);
        company.printEmployeeInfo(employees);
        company.sortEmployeeInfo(employees);
        System.out.println("after sort...");
        company.printEmployeeInfo(employees);

    }
}

class Employee{
    private String name;
    private char kpi;

    public char getKpi() {
        return kpi;
    }

    public Employee(String name, char kpi) {
        this.name = name;
        this.kpi = kpi;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", kpi=" + kpi +
                "}\n";
    }
}
