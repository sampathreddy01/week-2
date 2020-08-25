package transactions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Calculation {
int cId;
String tType;
String tDate;
boolean flag;
int fee;
public static String out = "";
public Calculation(int cId, String tType, String tDate, boolean flag, int fee)
{
	this.cId = cId;
	this.tDate = tDate;
	this.tType = tType;
	this.flag = flag;
	this.fee = fee;
}
public static void result(String line)
{
	String [] arr = line.split(",");
	System.out.println(arr[5]);
	if(arr[2].equals(""))
	{
		out  = out + arr[1] + "," + arr[3] + "," + arr[4] + "," + arr[6];
		if(arr[6].equals("N"))
			out = out + "," + "500";
		else
		{
			if(arr[3].equals("sell") || arr[3].equals("withdraw"))
				out = out + "," + "100";
			else
				out = out + "," + "50";
		}
		out = out + "\n";
	}
	else
	{
		out = out + arr[1] + "," + arr[3] + "," + arr[4] + "," + "N" +"," + "10" + "\n";
	}
}
public static void printLog() throws IOException
{

	try{    
        FileWriter fw=new FileWriter("C:\\Users\\sampath\\Downloads\\input.csv");    
        fw.write(out);  
        System.out.println(out);
        fw.close();    
       }catch(Exception e){System.out.println(e);}    
       System.out.println("Success..."); 
}


}