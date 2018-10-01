package com.company;
import java.util.Scanner;
public class Main {

    public static <string> void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //int n=scan.nextInt();
        double c=0, d=0;
           for( int n=2; n<=5; n++){
            for (int  c = 1; c<=100; c++){
                for (int a = 1; a <=10; a++)
                    for (int b = 1; b <= 10; b++){
                    //c=(Math.pow(a, n));
                        d=(Math.pow(a, n)+Math.pow(b,n));
                        if (Math.pow(c,n) == d)
                            System.out.println(a+"^" + n + "+ " +b+"^"+n+"="+d;
                    
            }}}}
        /*String s1="stroka1", s2="stroka2", s3="stroka3", s4="stroka4", s5="stroka5";
        if (s4==s5){
            System.out.println(s1+s2);
        }
        else
            System.out.println(s1 + s3);*/
