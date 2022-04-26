package casestudy.service;

import java.io.IOException;

public interface Service {
    void display() throws IOException;
    void addNew() throws IOException;
    void edit();
    void delete();

}
