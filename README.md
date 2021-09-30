## Java Fundamentals

1.  Вычислить значение выражения по формуле (все переменные принимают действительные значения).
<img width="200" height="150" alt="Снимок экрана 2021-09-18 в 22 10 22" src="https://user-images.githubusercontent.com/74743036/133906069-00df4f9e-1ce0-492f-bca8-a546dd040c93.png">

2.  Для данной области составить программу, которая печатает true, если точка с координатами (x,y) принадлежит закрашенной области, и false  - в противном случае.
<img width="200" alt="Снимок экрана 2021-09-18 в 22 18 59" src="https://user-images.githubusercontent.com/74743036/133906200-f4984451-ee78-4b31-8596-a69a98e78d4f.png">

3.   Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции.  F(x)=tg(x)

4.   Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.

5.   Дана целочисленная таблица А[n]. Найти наименьшее число K элементов, которые можно выкинуть из данной последовательности, так чтобы осталась возрастающая подпоследовательность.

6.   Даны действительные числа a1, a2, ..., an. Получить следующую квадратную матрицу порядка n.
<img width="200" alt="Снимок экрана 2021-09-18 в 22 25 08" src="https://user-images.githubusercontent.com/74743036/133906325-c4725370-8eb7-4926-924b-a148a1fc2800.png">


7.  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

8.  Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <=an и b1 <= b2 <= ... <= bm. Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

##  Classes and Objects

9.  Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. Определить вес мячиков в корзине и количество синих мячиков.

10.  Скомпилировать и запустить приложение, созданное при решении задачи 9 из командной строки.

11.  Создать запускной jar-файл и запустить приложение, созданное при решении задачи 9-ть.

12.  Не пользуясь средствами автогенерации кода переопределить для класса Book методы equals(), hashCode() и toString().
```Java
public class Book {
  private String title;
  private String author; 
  private int price;
  private static int edition;
}
```

13. Не пользуясь средствами автогенерации кода переопределить для класса ProgrammerBook методы equals(), hashCode() и toString().
```Java
public class ProgrammerBook extends Book { 
  private String language;
  private int level;
}
```

14. Не пользуясь средствами автогенерации кода переопределить для класса Book из задачи 12 метод clone().

15. Добавьте в класс Book из задачи 12 поле isbn. Реализуйте в классе Book интерфейс Comparable так, чтобы книги приобрели сортировку по умолчанию согласно номеру isbn.

16. Реализуйте для класса Book из задачи 12 компараторы, позволяющие сортировать книги по названию; по названию, а потом по автору; по автору, а потом по названию; по автору, названию и цене.
