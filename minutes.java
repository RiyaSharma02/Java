

import java.util.Scanner;
class prac{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int rmin;
int min,minutesInYear,minutesInDays,minutesInMonths;
int yy,mm,dd;


minutesInYear=60*24*365;
minutesInDays=60*24;
minutesInMonths=60*24*30;
System.out.println("Enter number of minutes");
min=sc.nextInt();


yy=min/minutesInYear;
rmin=min%minutesInYear;

mm=rmin/minutesInMonths;
rmin=rmin%minutesInMonths;

dd=rmin/minutesInDays;
rmin=rmin%minutesInDays;
System.out.println(yy+"-"+mm+"-"+dd);
}}


 