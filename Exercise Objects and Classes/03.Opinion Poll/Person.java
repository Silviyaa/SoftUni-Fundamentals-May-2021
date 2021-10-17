public class Person {
    //полета -> характеристики
    private String name;
    private int age;

    //контруктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }
}
