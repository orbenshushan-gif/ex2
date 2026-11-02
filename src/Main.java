import java.lang.Math;
import java.util.Scanner;
public class Main
{
    public  static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();
        if (exercise == 1) {
            f1();
        }
        else if (exercise == 2) {
            f2();
        }
        else if (exercise == 3) {
            f3();
        }
        else if (exercise == 4) {
            f4();
        }
        else if (exercise == 5) {
            f5();
        }
        else if (exercise == 6) {
            f6();
        }
        else if (exercise == 7) {
            f7();
        }
        else if (exercise == 8) {
            f8();
        }
        else if (exercise == 9) {
            f9();
        }
        else if (exercise == 10) {
            f10();
        }
         else {
            System.out.println("Incorrect exercise number. Try again.");
        }

    }
    public static void f1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name;
        name = scanner.next();

        System.out.println("enter your age: ");
        int age;
        age = scanner.nextInt();

        System.out.println("enter your height: ");
        int height;
        height = scanner.nextInt();

        System.out.println("enter your last name first letter: ");
        char lastNameInitial;
        lastNameInitial = scanner.next().charAt(0);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + (height));
        System.out.println("Last Name Initial: " + lastNameInitial);
        System.out.println("your age in 10 years: " + (age + 10));

    }

    public static void f2()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter seconds number: ");
        int seconds;
        seconds = scanner.nextInt();

        int minutes = 0;
        int hours = seconds / 3600;
        if(hours > 0)
        {
            seconds -= hours * 3600;
            minutes = seconds / 60;
            seconds -= minutes * 60;
            System.out.println("hours: " + hours);
            System.out.println("minutes: " + minutes);
            System.out.println("seconds: " + seconds);
        }
        else
        {
            minutes = seconds / 60;
            seconds -= minutes * 60;
            System.out.println("hours: " + hours);
            System.out.println("minutes: " + minutes);
            System.out.println("seconds: " + seconds);
        }

    }

    public static void f3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the bill amount: ");
        int bill;
        bill = scanner.nextInt();

        System.out.println("enter the wanted tip percentage: ");
        int percentage;
        percentage = scanner.nextInt();

        System.out.println("enter the number of people: ");
        int people;
        people = scanner.nextInt();

        double tip = (bill/100) * percentage;
        double total = bill + tip;
        double perPerson = total/people;

        System.out.println("Bill: " + bill);
        System.out.println("Tip percentage: " + percentage);
        System.out.println("People: " + people);

        System.out.println("\n\nTip: " + tip);
        System.out.println("Total: " + total);
        System.out.println("Per Person: " + perPerson);
    }

    public static void f4()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the price: ");
        double price;
        price = scanner.nextDouble();

        System.out.println("purchased units: ");
        int purchasedUnits;
        purchasedUnits = scanner.nextInt();

        System.out.println("discount percentage: ");
        int discountPercentage;
        discountPercentage = scanner.nextInt();

        double totalPrice = price*purchasedUnits;
        double totalDiscount = ((totalPrice/100) * discountPercentage);
        double finalPrice = totalPrice - totalDiscount;

        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount Sum: " + totalDiscount);
        System.out.println("Final price: " + finalPrice);

    }

    public static void f5()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the km you drove: ");
        int km;
        km = scanner.nextInt();

        System.out.println("enter the minutes you drove: ");
        int minutes;
        minutes = scanner.nextInt();


        double hours = (minutes / 60.0);
        double averageSpeed = km/hours;

        System.out.println("Time In Hours: " + hours);
        System.out.println("Average speed: " + averageSpeed + " km/h");
        System.out.println("Distance in one hour: " + averageSpeed + " km");
    }

    public static void f6()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your assignments grade: ");
        int assignmentsGrade;
        assignmentsGrade = scanner.nextInt();

        System.out.println("enter your quiz grade: ");
        int quizGrade;
        quizGrade = scanner.nextInt();

        System.out.println("enter your final exam grade: ");
        int finalExamGrade;
        finalExamGrade = scanner.nextInt();

        double finalGrade = ((assignmentsGrade * 0.2) + (quizGrade * 0.3) + (finalExamGrade * 0.5));

        if(finalGrade >= 60 && finalGrade <= 100)
        {
            System.out.println("Final grade: " + finalGrade + "\nResult: Pass");
        }
        else
        {
            System.out.println("Final grade: " + finalGrade + "\nResult: Failed");
        }

    }

    public static void f7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number: ");
        int num1;
        num1 = scanner.nextInt();

        System.out.println("enter the second number: ");
        int num2;
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("number 1 is bigger");
        }
        if (num1 < num2) {
            System.out.println("number 2 is bigger");
        }
        if(num1 == num2)
        {
            System.out.println("the numbers are equal");
        }


        if (num1 % 2 == 0)
        {
            System.out.println("number 1 is even");

        }
        if (num1 % 2 != 0)
        {
            System.out.println("number 1 is odd");
        }

        if (num2 % 5 == 0)
        {
            System.out.println("number 2 is divisible in 5");
        }
        if (num2 % 5 != 0)
        {
            System.out.println("number 2 is not divisible in 5");
        }

        if (num1 + num2 > 0)
        {
            System.out.println("the sum of the numbers is positive");
        }
        if (num1 + num2 < 0)
        {
            System.out.println("the sum of the numbers is negative");
        }
        if(num1 + num2 == 0)
        {
            System.out.println("the sum of the numbers is equals to zero");
        }
    }

    public static void f8()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your age for get your ticket price: ");
        int age;
        age = scanner.nextInt();

        if(age < 6 && age > 0)
        {
            System.out.println("your ticket price: 0");
        }
        if(age > 6 && age <= 17)
        {
            System.out.println("your ticket price: 30");
        }
        if(age > 17 && age < 64)
        {
            System.out.println("your ticket price: 45");
        }
        if(age >= 65)
        {
            System.out.println("your ticket price: 25");
        }
        if(age < 0)
        {
            System.out.println("Invalid age, Please try again.");
        }
    }

    public static void f9()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a word to get information about it: ");
        String word;
        word = scanner.nextLine();


        int wordLength = word.length();
        String upper = word.toUpperCase();
        String lower = word.toLowerCase();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(wordLength-1);

        System.out.println("Length: " + wordLength);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);


    }

    public static void f10()
    {
        int a = 7;
        int b = 2;

        System.out.println(a / b);
        System.out.println(a / 2.0);


        int num = 2147483647;

        System.out.println(num);
        System.out.println(num + 1);


        double y = 0.1;
        double x = 0.2;

        System.out.println(y + x);
        System.out.println(y + x == 0.3);


        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println(smallPrecision + 1);
        System.out.println(highPrecision + 1);

    }



}