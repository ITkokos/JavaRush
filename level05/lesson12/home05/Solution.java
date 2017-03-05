package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        for (boolean isExit = false; !isExit; )
        {
            String sA = reader.readLine();
            isExit = sA.equals("сумма");
            if (!isExit){
                int a = Integer.parseInt(sA);
                res = res + a;
            }
        }
        System.out.println(res);
    }
}
