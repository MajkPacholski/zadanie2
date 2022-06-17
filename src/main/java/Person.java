public class Person {


    private String name;
    private String surname;
    private Integer age;
    private Integer high;


    public Person() {
    }

    public Person(String name, String surname, Integer age, Integer high) {
        this.name = name;
        this.surname = this.surname;
        this.age = age;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", heigh=" + high +
                '}';
    }
}