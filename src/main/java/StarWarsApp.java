package main.java;

public class StarWarsApp
{
    public static void main(String[] args)
    {
        Jedi jedi = new Jedi();
        jedi.setFirstName("Luke");
        jedi.setLastName("Skywalker");

        System.out.println(jedi);
    }
}
