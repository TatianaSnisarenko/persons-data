import java.util.Scanner;

public class PersonsData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your name");
        String name = in.nextLine();
        System.out.println("Please, enter your city");
        String city = in.nextLine();
        System.out.println("Please, enter your age");
        int age = Integer.parseInt(in.nextLine());
        System.out.println("Please, enter your hobby");
        String hobby = in.nextLine();
        System.out.println();
        System.out.printf("%-11s %s \n", "Name:", name);
        System.out.printf("%-11s %s \n", "City:", city);
        System.out.printf("%-11s %d \n", "Age:", age);
        System.out.printf("%-11s %s \n", "Hobby:", hobby);

        System.out.println();

        System.out.printf("A person by name %s lives in a city %s. \nThis person is %d years old and he/she likes %s.", name, city, age, hobby);

        System.out.println();
        System.out.println();

        System.out.printf("%-11s - %s \n", name, "name");
        System.out.printf("%-11s - %s \n", city, "city");
        System.out.printf("%-11d - %s \n", age, "age");
        System.out.printf("%-11s - %s \n", hobby, "hobby");


    }
}
