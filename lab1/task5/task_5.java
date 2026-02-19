package lab1.task5;

import java.util.Vector;

class Person {
    enum Gender {
        BOY, GIRL
    }

    private final Gender gender;
    private final String id;

    Person(String id, Gender gender) {
        this.id = id;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String toString() {
        return String.format("Person<id:%s, gender:%s>", id, gender);
    }
}

class DragonLaunch {
    private final Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        int n = kidnapped.size();
        if (n > 0
                && kidnapped.elementAt(n - 1).getGender() == Person.Gender.BOY
                && p.getGender() == Person.Gender.GIRL) {

            kidnapped.remove(n - 1);
        } else {
            kidnapped.add(p);
        }
    }

    public boolean willDragonEatOrNot() {
        return !kidnapped.isEmpty();
    }
}

public class task_5 {
    public static void main(String[] args) {
        DragonLaunch d = new DragonLaunch();

        Person[] line = {
                new Person("24B02", Person.Gender.BOY),
                new Person("24B04", Person.Gender.BOY),
                new Person("24B03", Person.Gender.GIRL),
                new Person("24B01", Person.Gender.GIRL)
        };

        System.out.println("Start: " + d.willDragonEatOrNot());
        for (Person p : line) {
            d.kidnap(p);
            System.out.println("Kidnap: " + p + " -> " + d.willDragonEatOrNot());
        }
    }
}
