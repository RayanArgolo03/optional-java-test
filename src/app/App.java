package app;

import enums.Option;
import services.BookService;

import java.util.*;

public class App {

    public static void main(String[] args) {

        BookService service = new BookService();
        Option option;
        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {

            printMenu();
            System.out.print("Your choice: ");

            try {
                option = Option.getOptions().get(sc.nextInt() - 1);

                if (option == Option.EXIT) break loop;
                final Option finalOption = option;

                //If returns book, sout book. If not, sout invalid optinal
                service.find(option)
                        .ifPresentOrElse(
                                b -> System.out.println("Your book information: " + b),
                                () -> System.out.println("Invalid " + finalOption + "!")
                        );


            } catch (NumberFormatException e) {
                System.out.println("Error! " + e.getMessage());
            }

        }

    }

    private static void printMenu() {
        List<Option> options = Option.getOptions();
        options.forEach(option -> System.out.println((options.indexOf(option) + 1) + " - " + option));
    }

}