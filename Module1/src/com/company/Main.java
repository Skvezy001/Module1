package com.company;


public class Main {

    public static void main(String[] args) {
        String str = "{qw(er[tt]t<yuii>123)4567}";
        Calculate calculate = new Calculate();
        if(calculate.checkString(calculate.delTrash(str))){
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }


}