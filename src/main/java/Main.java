import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    List personList = addPeronToList();
        personList.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getHigh));


        for (Object human : personList)
        System.out.println(human);
    }

    public static List addPeronToList(){

        Person personOne = new Person("Michal", "Pacholski", 33, 160);
        Person personTwo = new Person("Piotr", "Fiedorow", 33, 187);
        Person personTree = new Person("Adrian", "Kujawa", 30, 160);
        Person personFour = new Person("Mariusz", "Pudzianowski", 33, 187);


        List personList = new ArrayList<>();

        personList.add(personOne);
        personList.add(personTwo);
        personList.add(personTree);
        personList.add(personFour);

        return personList;
    }
}



  /*Napisz klasę Person, gdzie każda z osób może mieć właściwości tj. imię, nazwisko, wiek, wzrost.
        Utwórz listę osób z danymi:

        Michał:Pacholski:33:160
        Piotr:Fiedorow:33:187
        Adrian:Kujawa:30:160
        Mariusz:Pudzianowski:33:187

        Wyświetl listę użytkowników sortując ich najpierw po wieku a kolejno po wzroście tzn.
        jeśli istnieją dwie osoby w tym samym wieku należy sprawdzić wzrost. Wyższa osoba przodem ;)

        Dodatkowo:
        - dodaj metodę toString() do klasy Person i wykonaj na każdym userze metodę toString().
        Metoda ma printować wg. wzorca:
        imię=Piotr, nazwisko=Fiedorow, wiek=33, wzrost=187

        - nadpisz metodę equal(), która umożliwi sprawdzenie czy dwie osoby są równe na podstawie wieku i wzrostu.
        (Nie porównujemy imienia i nazwiska). W przypadku Piotra i Mariusza powinna być zwrócona wartość "true".*/