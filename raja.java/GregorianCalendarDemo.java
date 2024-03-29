import java.util.*;

class GregorianCalendarDemo
{
	public static void main(String args[])
	{
		String months[] = {
			"Jan", "Feb", "Mar", "Apr", 
			"May", "Jun", "Jul", "Aug", 
			"Sep", "Oct", "Nov", "Dec"
		};

	int year;
	
	GregorianCalendar gcalendar = new GregorianCalendar();

	System.out.println("Date : ");
	System.out.println(months[gcalendar.get(Calendar.MONTH)]);
	System.out.println(" " + gcalendar.get(Calendar.DATE) + " ");
	System.out.println(year = gcalendar.get(Calendar.YEAR));

	System.out.println("Time : ");
	System.out.println(gcalendar.get(Calendar.HOUR) + ":");
	System.out.println(gcalendar.get(Calendar.MINUTE) + ":");
	System.out.println(gcalendar.get(Calendar.SECOND));
	
	if(gcalendar.isLeapYear(year))
	{
		System.out.println("The current year is a leap year ");
	}
	else
	{
		System.out.println("The current year is not a leap year  ");
	}
	}
}

/*

Date :
Feb
 22
2024
Time :
9:
25:
16
The current year is a leap year

*/