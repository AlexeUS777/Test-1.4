import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.io.ObjectInput;
import java.util.Scanner;

public class MyThirdClass {
    public static void main(String [] args){

        //Во всех задачах исходные данные вводит пользователь:

        //1.Составьте программу, которая переводит переменную из byte в short.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number:");
        byte q = scanner.nextByte();   //при расширении типов, от меньшего к большему, java
        short q1 = q;                  //автоматически сама переходит на новый тип, поэтому
        System.out.println(q1);        //я вручную этого и не делаю в этих заданиях...

        //2.Составьте программу, которая переводит переменную из short в int.
        System.out.print("Please enter number::");
        short w = scanner.nextShort();
        int w1 = w;
        System.out.println(w1);

        //3.Составьте программу, которая переводит переменную из int в long.
        System.out.print("Please enter number:");
        int e = scanner.nextInt();
        long e1 = e;
        System.out.println(e1);

        //4.Составьте программу, которая переводит переменную из long в int.
        System.out.print("Please enter number:");
        long r = scanner.nextLong();
        int r1 = (int)r;                      //а здесь при сужении типов, я уже делаю это вручную
        System.out.println(r1);

        //5.Составьте программу, которая переводит переменную из float в double.
        System.out.print("Please enter number:");
        float t = scanner.nextFloat();
        double t1 = t;
        System.out.println(t1);

        //6.Составьте программу, которая переводит переменную из double в float.
        System.out.print("Please enter number:");
        double y = scanner.nextDouble();
        float y1 = (float)y;
        System.out.println(y1);

        //7.Придумайте способ переводить из int в boolean и наоборот.
        System.out.print("Please enter 1 or 0:");
        int u = scanner.nextInt();
        boolean u1 = true;
        if(u == 1){
            System.out.println(u1);
        } else {
            System.out.println(false);
        }

        System.out.print("Please enter true or false:");
        boolean i = scanner.nextBoolean();
        if(i != true){
            System.out.println(0);
        } else{
            System.out.println(1);
        }

        //8.Придумайте способ переводить из String в boolean.
        System.out.print("Please enter true or other text:");
        String str1 = scanner.nextLine();
        Boolean bool1 = Boolean.valueOf(str1);
        System.out.println(bool1);

        //9.Переведите переменную из char в string.
        System.out.print("Please enter your word:");
        char sym = scanner.next().charAt(0);
        System.out.println("Первая буква слова: " + sym);

        //10.Переведите переменную из char в int и наоборот.
        System.out.print("Please enter your symbol:");
        char sym1 = scanner.next().charAt(0);
        int num1 = (int)sym1;
        System.out.println("Номер данного символа: " + num1);

        System.out.print("Please enter your number:");
        int num2 = scanner.nextInt();
        char sym2 = (char)num2;
        System.out.println(sym2);

        //11.Пусть int равен от 30 до 150.
        // Переведите каждый int в char, и выведите таблицу, где на каждой строчке есть int и соответствующий ему char.

        //(Здесь ввод от пользователя применять не стал, так как нужна таблица со всеми значениями в этом
        //диапазоне, а если пользователь будет вводить какое-то число, то получится как в
        //задаче выше, которая уже решена)
        int l = 30;
        while (l <= 150){
            System.out.print(l + " ");
            System.out.println((char)l);

            JFrame frame = new JFrame();
            frame.setTitle("Table Symbol");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Object[][] data = {
                    {l, (char)l}
            };
            String[] columnNames = {"Номер", "Символ"};
            JTable table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            frame.setSize(300, 200);
            frame.setVisible(true);

            l++;
        }

        //Не совсем понятно, достаточно ли было в этом задании простого вывода или именно таблицу надо было сделать?)
        //Долго искал, пытался научиться делать таблицу, в итоге сделал и то и то, но единственное, у меня то ли с
        //java что-то, то ли что-то не так сделал, что при выводе в консоль некоторые символы не поддерживаются(отобра-
        //жаются), то ли что-то не так сделал. Или это нормально? Посмотрите и скажите, пожалуйста))



    }
}
