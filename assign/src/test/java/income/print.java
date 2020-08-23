package income;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class print{
	
	int Id;
	String type;
	String date;
	boolean flag;
	int fee;
	public static String india = "";
	public static String uk = "";
	public static String hk = "";
	public static String sg = "";
	public print(int Id, String type, String date, boolean flag, int fee)
{
	this.Id = Id;
	this.date = date;
	this.type = type;
	this.flag = flag;
	this.fee = fee;
}
public static void total(String line)
{
	System.out.println(line);
	String [] arr = line.split(",");
	if(arr[1].equals("UK"))
	{
		Double inc = calculate(Integer.parseInt(arr[4]),arr[3]);
		uk = uk + arr[1] + "," + arr[2] + "," + inc + "\n";
 	}
	else if(arr[1].equals("India"))
	{
		Double inc = calculate(Integer.parseInt(arr[4]),arr[3]);
		india = india + arr[1] + "," + arr[2] + "," + inc + "\n";
 	}
	else if(arr[1].equals("Singapore"))
	{
		Double inc = calculate(Integer.parseInt(arr[4]),arr[3]);
		sg = sg + arr[1] + "," + arr[2] + "," + inc + "\n";
 	}
	else if(arr[1].equals("HongKong"))
	{
		Double inc = calculate(Integer.parseInt(arr[4]),arr[3]);
		hk = hk + arr[1] + "," + arr[2] + "," + inc + "\n";
 	}
	else
		return;
}
}