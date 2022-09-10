import java.util.Objects;

public class Author extends Object {
    private  final  String name ;
    private  final  String surname ;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {return name;}

    public String getSurname() { return surname;}

    public  String getFullName () {return  name + " " + surname; }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object o1) {return super .equals(o1);}

    @Override
    public String toString ( ) {
        return " Наш автор : " + this.name + " " + this.surname;
    }
}
