
public class extra {
	Calculate_Day cal=new Calculate_Day();
	public Date_input tomorrow(Date_input dt1)
	{
		return cal.addDate(dt1,1);
	}
	public Date_input Dayaftertomorrow(Date_input dt1)
	{
		
		return cal.addDate(dt1,2);
	}
	public Date_input yesterday(Date_input dt1)
	{
		return cal.subDate(dt1, 1);
	}
	public Date_input  Daybeforeyesterday(Date_input dt1)
	{
		return cal.subDate(dt1, 2);
	}
	public Date_input lastWeek(Date_input dt1)
	{
		return cal.subDate(dt1, 7);
	}
	public Date_input nextWeek(Date_input dt1)
	{
		return cal.addDate(dt1, 7);
	}
	public Date_input nextMonth(Date_input dt1)
	{
		return cal.addDate(dt1, 30);
	}
	public Date_input nextYear(Date_input dt1)
	{
		return cal.addDate(dt1, 365);
	}
	public Date_input lastMonth(Date_input dt1)
	{
		return cal.subDate(dt1, 30);
	}
	public Date_input lastYear(Date_input dt1)
	{
		return cal.subDate(dt1, 365);
	}
	public Date_input nweeksafter(Date_input dt1,int n)
	{
		return cal.addDate(dt1, n*7);
	}
	public Date_input nDaysAfter(Date_input dt1,int n)
	{
		return cal.addDate(dt1, n);
	}
	public Date_input nMonthsAfter(Date_input dt1,int n)
	{
		return cal.addDate(dt1, 30*n);
	}
	public Date_input nYearsAfter(Date_input dt1,int n)
	{
		return cal.addDate(dt1, 365*n);
	}
	public Date_input nweeksBefore(Date_input dt1,int n)
	{
		return cal.subDate(dt1, n*7);
	}
	public  Date_input nDaysBefore(Date_input dt1,int n)
	{
		return cal.subDate(dt1, n);
	}
	public Date_input nMonthsBefore(Date_input dt1,int n)
	{
		return cal.subDate(dt1, 30*n);
	}
	public Date_input nYearsBefore(Date_input dt1,int n)
	{
		return cal.subDate(dt1, 365*n);
	}

}
