
public class Date_input {
	int date,month,year;
	public Date_input(String s) {
		String[] seper=s.split("-");
		date=Integer.parseInt(seper[0]);
		month=Integer.parseInt(seper[1]);
		year=Integer.parseInt(seper[2]);
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
