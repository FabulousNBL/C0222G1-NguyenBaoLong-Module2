package _16_text_file.exercise.nation;

public class Nation {
    private String id;
    private String name;

    private String nation;

    public Nation() {
    }

    public Nation(String id,String name, String nation) {

        this.id = id;
        this.name = name;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
