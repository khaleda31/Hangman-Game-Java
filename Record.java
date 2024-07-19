import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Record {
    String StudentID, StudentName, StudentTime;
    String time;
    String curTime;
    long start,end;
    
    final String cyan = "\033[0;36m";
    final String red = "\033[0;31m";
    final String pink = "\033[38;5;206m";
	final String purple = "\033[0;35m";
    final String reset = "\u001B[0m";
    final String green = "\033[0;32m";

    public Record(String ID, String Name, String Time)
    {
        this.StudentID = ID;
        this.StudentName = Name;
        this.StudentTime = Time;
    }

    public void getDetails()
    {
        Scanner in = new Scanner (System.in);
        System.out.print(pink + "Enter your Student ID: " + reset);
        StudentID = in.nextLine();
        System.out.print(pink + "Enter your name: " + reset);
        StudentName = in.nextLine();
    }
    
    public void printDetails()
    {
        System.out.println("\nStudent ID: " + cyan + StudentID + reset + "\nStudent Name: " + cyan + StudentName + reset);
        SimpleDateFormat format = new SimpleDateFormat(" hh:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Time ended : " + cyan + format.format(date) + reset);
    }
    
    

}
