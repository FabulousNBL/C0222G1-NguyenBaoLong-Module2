package movieTheater.controller;

import movieTheater.service.implement.MovieServiceImpl;

import java.util.Scanner;

public class Controller {
    static MovieServiceImpl movieService= new MovieServiceImpl();
    static Scanner input = new Scanner(System.in);
    public static void displayMenu(){
        while (true){
            System.out.println("Menu");
            System.out.println("1. Display all movie");
            System.out.println("2. Add new movie");
            System.out.println("3. Delete movie");
            System.out.println("0. Exit");
            String choice= input.nextLine();
            switch (choice){
                case "1":
                    movieService.displayMovie();
                    break;
                case "2":
                    movieService.addNewMovie();
                    break;
                case "3":
                    movieService.deleteMovie();
                    break;
                case "0":
                    System.exit(0);

            }
        }
    }

}
