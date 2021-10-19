package JavaOOP;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("08/29/1970", "Marty");
        System.out.println(p.speak());
        System.out.println(p.getYearsOld());

        Cat c = new Cat("02/02/2018", "Gypsy");
        System.out.println(c.speak());
        System.out.println(c.getYearsOld());

        Dog d = new Dog("10/10/2020", "Booch");
        System.out.println(d.speak());
        System.out.println(d.getYearsOld());
    }
}
