package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    private String name;
    private int len;
    private String color;

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, int len){
        this.name = name;
        this.len = len;
    }

    public Dog(String name, int len, String color){
        this.name = name;
        this.len = len;
        this.color = color;
    }
}
