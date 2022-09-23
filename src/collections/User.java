package collections;

import collections.util.UtilGenerate;

import java.util.List;
import java.util.Objects;

import static collections.util.Util.getRandomUser;

public class User {

    private String name;

    private List<User> friends;

    public User(String name, List<User> friends) {
        this.name = name;
        this.friends = friends;
    }

    public User() {

        name = getRandomUser();
        friends = UtilGenerate.getFriends(5);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(friends, user.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, friends);
    }

    @Override
    public String toString() {
        return
                name + "-> "+'\n' + '{' +
                        friends + '}'
                ;
    }
}
