package com.eonjava;

public class Jedi
{
    private String firstName;
    private String lastName;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String value)
    {
        this.firstName = value;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String value)
    {
        this.lastName = value;
    }

    public String useForce()
    {
        return "I am using the FORCE!";
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "[firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
