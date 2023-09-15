package ru.vpak.simpleint;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Calc maximal simple integer!" );
        SimpleInt smp = new SimpleInt(10000);
        System.out.println(smp + ".calc = " + smp.calc());
        System.out.println("It's under control SCV Git!");
        System.out.println("new branch 'developer-Two-work'");
        int i = 21;
        System.out.println(("i = " + i));
        System.out.println("New branch 'first-new-branch'");
        System.out.println("Hello i'm developer A!");
        System.out.println("Hello i'm developer Two!");
    }
}
