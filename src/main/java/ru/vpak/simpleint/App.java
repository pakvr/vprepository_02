package ru.vpak.simpleint;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Calc maximal simple integer!" );
        SimpleInt smp = new SimpleInt(10000);
        System.out.println(smp + ".calc = " + smp.calc());
    }
}
