package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String text1 = "Мама";
        String text2 = "Мыла";
        String text3 = "Раму";
        System.out.println(text1+text2+text3);
        System.out.println(text1+text3+text2);
        System.out.println(text2+text1+text3);
        System.out.println(text2+text3+text1);
        System.out.println(text3+text1+text2);
        System.out.println(text3+text2+text1);
    }
}