package transactions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader{
	public static void read(String filename){
		File file=new File(filename);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(br);
		String del=",";
		while((line = br.readLine()) != null) {
	        	if(i==0) i=i+1;
	        	else
	        	{
	        	LogBook.detailLog(line);
	            tempArr = line.split(delimiter);
				System.out.println(Integer.parseInt(tempArr[0]));
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " ");
					}
	            System.out.println();
					}
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
		
}
}