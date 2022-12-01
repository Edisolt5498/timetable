import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int amount = 50;  //количество учителей и предметов

        System.out.println("Tap: \n1 - to add new teacher.");
        System.out.println("2 - to add new subject.");
        Scanner in = new Scanner(System.in);
        String trigger = in.nextLine();
        Teacher[] teachers = new Teacher[amount];
        Subject[] subjects = new Subject[amount];

        while (trigger.equals("2")  && Subject.getCount() < amount) //сохраняем предметы
        {
            System.out.println("What is name of subject? ");    //спрашиваем название предмета
            Scanner inName = new Scanner(System.in);
            String name = inName.nextLine();
            System.out.println("What is day of " +name +" ?");  //спрашиваем дату проведения предмета
            Scanner inDay = new Scanner(System.in);
            int day = inDay.nextInt();

            subjects[Subject.getCount()] = new Subject(name, day);  // создает объект класса subject и присваеваем объекту имя и дату

            System.out.println("Tap: \n1 - to add new teacher.");
            System.out.println("2 - to add new subject.");

            trigger = in.nextLine();
        }

        while (trigger.equals("1") && Teacher.getCount() < amount)  // сохраняем учителей
        {
            System.out.println("Write firstname and lastname: ");   //спрашиваем имя учителя
            Scanner inName = new Scanner(System.in);
            String name = inName.nextLine();
            System.out.println("Write your age: "); //спрашиваем возраст учителя
            Scanner inAge = new Scanner(System.in);
            int age = inName.nextInt();

            teachers[Teacher.getCount()] = new Teacher(name, age);  // создает объект класса teacher и присваеваем объекту имя и возраст

            System.out.println("Choose your subject. Tap:");    // присваеваем учителю предмет (объект класса subject)
            for (int i = 0; i < Subject.getCount(); i++) {
                System.out.print(i+1 +" to ");
                subjects[i].sayInfo();
                System.out.println();
            }
            Scanner chooseSub = new Scanner(System.in);
            teachers[Teacher.getCount()-1].setSub(subjects[(chooseSub.nextInt()-1)]);


            System.out.println("Tap: \n1 - to add new teacher.");
            trigger = in.nextLine();
        }

        for (int i = 0; i < Teacher.getCount(); i++)    //вывод информации
        {
            teachers[i].sayInfo();
            System.out.println();
        }

    }
}