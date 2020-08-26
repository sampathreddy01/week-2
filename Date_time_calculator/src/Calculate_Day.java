import java.util.HashMap;

public class Calculate_Day {
	int day_in_months[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	HashMap<Integer,String> day_of_week= new HashMap<Integer,String>();
	public Calculate_Day() {
		day_of_week.put(1,"Monday");
		day_of_week.put(2,"Tuesday");
		day_of_week.put(3,"Wednesday");
		day_of_week.put(4,"Thusday");
		day_of_week.put(5,"Friday");
		day_of_week.put(6,"Saturday");
		day_of_week.put(7,"Sunday");	
	}
	int LeapYear(Date_input d) {
		int years = d.year; 
		if (d.month <= 2)  
		{ 
		years--; 
		} 
		return years / 4 - years / 100 + years / 400;
	}
	int difference(Date_input d1,Date_input d2) {
		int n1 = d1.year * 365 + d1.date; 
        for (int i = 0; i < d1.month - 1; i++)  
        { 
            n1 += day_in_months[i]; 
        }
        n1 += LeapYear(d1); 
        int n2 = d2.year * 365 + d2.date; 
        for (int i = 0; i < d2.month - 1; i++) 
        { 
            n2 += day_in_months[i]; 
        } 
        n2 += LeapYear(d2); 
        return (n2 - n1);
	}
	Date_input addDate(Date_input d1, int n)
	{
		int y = n/365;
		Date_input d2 = d1;
		d2.year = d2.year + y;
		n = n%365;
		int j = d2.month;
		while(n>0)
		{
			n = n-day_in_months[j-1];
			if(n>0)
			{
				d2.month = d2.month+1;
				j = j+1;
				if((j-1)>11)
					{
					j=0;
					d2.setMonth(1);
					d2.year = d2.year+1;
					}
			}	
		}
		n = n+day_in_months[j-1];
		d2.date = d2.date+n;
		if(d2.date> day_in_months[j-1])
		{
			d2.date = d2.date- day_in_months[j-1];
			if(d2.month != 12)
			d2.month = d2.month+1;
			else
			{
				d2.month = 1;
				d2.year = d2.year+1;
			}
		}
		return d1;
		
	}
	Date_input subDate(Date_input d1, int n)
	{
		int y = n/365;
		Date_input d2 = d1;
		d2.year = d2.year - y;
		n = n%365;
		int j = d2.month;
		while(n>0)
		{
			n = n-day_in_months[j-1];
			if(n>0)
			{
				d2.month = d2.month-1;
				j = j-1;
				if(j<0) j=11;
			}	
		}
		n = n+day_in_months[j-1];
		d2.date = d2.date-n;
		if(d2.date<=0)
		{
			d2.date = d2.date+ day_in_months[j-2];
			if(d2.month != 0)
			{
			d2.month = d2.month-1;
			}
			else
			{
				d2.month = 12;
				d2.year = d2.year-1;
			}
			
		}
		return d2;
		
	}
	int conversion(String t)
	{
		String [] arr = t .split(" ");
		if(arr.length == 2)
		{
			if(arr[1] == "year" ) return 365*Integer.parseInt(arr[0]);
			else if(arr[1] == "month" ) return 30*Integer.parseInt(arr[0]);
			else  return 1*Integer.parseInt(arr[0]);
		}
		if(arr.length == 6)
		{
			return 365*Integer.parseInt(arr[0]) + 30*Integer.parseInt(arr[2])+ Integer.parseInt(arr[4]);
		}
		return 0;
		
	}
	String dayofweek(Date_input d1) 
	{ 
		int y = d1.getYear();
		int m = d1.getMonth();
		int d = d1.getDate();
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	    int x = ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
		return d1.getDate(x); 
	} 
	
	int getWeekNumber(Date_input dt1)
	{
		int y = dt1.getYear();
		int m = dt1.getMonth();
		int d1 = dt1.getDate();
		int d =1;
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
	    y -= (m < 3) ? 1 : 0; 
	    int x = ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
	    int x1 = d1+x;
	    return (x1/7 + 1);
		
	}

}
