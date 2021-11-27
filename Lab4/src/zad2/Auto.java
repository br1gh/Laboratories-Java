package zad2;

import java.util.Random;

public class Auto
{
    float[] przebieg = new float[12];

    public Auto()
    {
        Random rand = new Random();
        for (int i = 0; i < 12; i++)
            przebieg[i] = rand.nextFloat() * (1000 - 0) + 0; // 0-1000 (float)
    }

    public float srPrzebieg()
    {
        float suma = 0;
        for (float i: przebieg)
            suma += i;
        return suma/12;
    }
}
