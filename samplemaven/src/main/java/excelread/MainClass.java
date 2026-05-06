package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainClass {
	static FileInputStream f;//java inbuilt class ,given 
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a, int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\praba\\OneDrive\\Documentos\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		
		XSSFRow r = s.getRow(a);  //XSSFRow is used to input row
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
		
	}
	
	public static int getIntegerData(int a,int b) throws IOException
	{

		f=new FileInputStream("C:\\Users\\praba\\OneDrive\\Documentos\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		
		XSSFRow r = s.getRow(a);  //XSSFRow is used to input row
		XSSFCell c = r.getCell(b);
		
		//type casting double to int
		int x= (int) c.getNumericCellValue();
		return x;
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(MainClass.getStringData(1, 0));
		System.out.println(MainClass.getIntegerData(1, 1));
		System.out.println(MainClass.getStringData(2, 0));
		System.out.println(MainClass.getIntegerData(2, 1));
		System.out.println(MainClass.getStringData(3, 0));
		System.out.println(MainClass.getIntegerData(3, 1));

	}

}
