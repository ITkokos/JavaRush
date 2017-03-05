package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);

        int res1=0;
        int res2=0;
        int res3=0;

        if (a<b && a<c) res1=a;
        if (b<a && b<c) res1=b;
        if (c<a && c<b) res1=c;

        if (a>b && a>c) res3=a;
        if (b>a && b>c) res3=b;
        if (c>a && c>b) res3=c;

        if (res1<a && a<res3) res2=a;
        if (res1<b && b<res3) res2=b;
        if (res1<c && c<res3) res2=c;

        System.out.println(res2);
    }
}
