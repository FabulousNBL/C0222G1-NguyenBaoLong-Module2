package movieTheater.service;

public interface MovieService extends Service{
    @Override
    void displayMovie();

    @Override
    void addNewMovie();

    @Override
    void deleteMovie();
}
