package movieTheater.service.implement;

import case_study.casestudy.util.ReadAndWrite;
import movieTheater.model.Movie;
import movieTheater.service.MovieService;


import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieServiceImpl implements MovieService {
    static final String REGEX_ID = "^CI-[0-9]{4}$";
    static Scanner input = new Scanner(System.in);
    static List<Movie> movies = new ArrayList<>();
    public static final String FILE_MOVIE = "src\\movieTheater\\data\\Movie.csv";

    public List<Movie> getMovies() {
        List<Movie> movieList = new ArrayList<>();
        List<String[]> strings = ReadAndWrite.readFile(FILE_MOVIE);
        for (String[] item : strings) {
            movieList.add(new Movie(item[0], item[1], item[2], Integer.parseInt(item[3])));
        }
        return movieList;
    }

    @Override
    public void displayMovie() {
        movies = getMovies();
        for (Movie item : movies) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void addNewMovie() {


        System.out.println("Enter movie's code ");
        String movieCode;

        while (true) {
            while (true) {
                movieCode = input.nextLine();
                if (movieCode.matches(REGEX_ID)) {
                    break;
                } else {
                    System.out.println("Input wrong format");
                }
            }
            boolean checkId = true;
            for (Movie item : movies) {
                if (item.getIdMovie().equals(movieCode)) {
                    checkId = false;
                    break;
                }
            }
            if (checkId) {
                break;
            } else {
                System.out.println("This movie has been added");
            }
        }


        System.out.println("Enter show date");
        String showDate;
        while (true) {
            try {
                showDate = input.nextLine();
                dateTimeCheck(showDate);
                break;
            } catch (Exception e) {
                System.err.println("Input wrong format");
            }
        }
        System.out.println("Enter movie's name");
        String name = input.nextLine();
        System.out.println("Nhập số lượng vé");
        int ticketAmount;
        while (true) {
            try {
                ticketAmount = Integer.parseInt(input.nextLine());
                break;
            } catch (Exception e) {
                System.err.println("Input wrong format");
            }
        }


        Movie movie = new Movie(movieCode, name, showDate, ticketAmount);
        movies.add(movie);
        List<String> list = new ArrayList<>();
        list.add(movie.getLine());
        movieTheater.utils.ReadAndWrite.writeFile(FILE_MOVIE, list);
        System.out.println("Đã thêm thành công");

    }

    @Override
    public void deleteMovie() {
        System.out.println("Nhập mã phim");
        String codeDelete;
        while (true) {
            codeDelete = input.nextLine();
            if (codeDelete.matches(REGEX_ID)) {
                break;
            } else {
                System.out.println("Input wrong format");
            }
        }
        boolean check = true;
        Movie movie = null;
        for (Movie item : movies) {
            if (item.getIdMovie().equals(codeDelete)) {
                check = false;
                movie = item;
                break;
            }
        }
        if (check) {
            System.out.println("This movie is not in the list");
        } else {
            System.out.println("Are you sure to delete this movie");
            System.out.println("1. Yes");
            System.out.println("2. No");
            String choice;
            while (true) {
                boolean flag = true;
                choice = input.nextLine();
                switch (choice) {
                    case "1":
                        flag = false;
                        break;
                    case "2":
                        return;
                }
                if (!flag) {
                    break;
                }
            }
            movies.remove(movie);
            File file = new File(FILE_MOVIE);
            file.delete();

            List<String> list = new ArrayList<>();
            for (Movie item : movies) {
                list.add(item.getLine());
            }
            movieTheater.utils.ReadAndWrite.writeFile(FILE_MOVIE, list);
        }
    }

    public static void dateTimeCheck(String time) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate startTime = LocalDate.parse(time, formatter);
        LocalDate timeNow = LocalDate.now();
        timeNow.format(formatter);

        if (startTime.isBefore(timeNow)) {
            throw new Exception();
        }
    }
}
