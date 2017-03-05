package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
 //   private static int res;


    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        for (boolean isExit = false; !isExit; )
        {
            String sA = reader.readLine();
            int a = Integer.parseInt(sA);
            res = res + a;
           // System.out.println(res);
            isExit = sA.equals("-1");
        }
        System.out.println(res);
    }
}
