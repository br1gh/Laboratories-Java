package com.company.Lab5.Zad3;

public class Example
{
    void wypisz(String x)
    {
        System.out.println(x.length());
    }

    public static void main(String[] args) throws Exception
    {
        Example ob = new Example();
        //ob.wypisz(null);
        try
        {
            ob.wypisz(null);
        }
        catch (NullPointerException ex)
        {
            ex.printStackTrace(System.out);
            ex.fillInStackTrace(); //Punkt 5
            //throw ex; //Punkt 3
            throw new Exception(ex); //Punkt 6
        }
    }
}
