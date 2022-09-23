package concurrent.homework;

public interface NameClient {
    String[] NAME = {"James",
            "James",
            "Vladimir",
            "Aldous",
            "William",
            "Joseph",
            "Arthur",
            "John",
            "Malcolm",
            "Samuel",
            "George",
            "Robert",
            "Virginia",
            "Theodore",
            "Carson",
            "Kurt",
            "Ralph",
            "Richard"};

    default String randomName() {
        String[] name = NAME;
        int x = (int) Math.floor(Math.random() * name.length);
        return name[x];
    }
}
