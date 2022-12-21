import java.util.*;
import java.io.*;

public class StudentDatabase {

	protected
		String name,address,rollno,id,course,branch;
	
	public
	//Creating File
		void CreateFile()
		{
			File f = new File("StudentDatabase.txt");
			try
			{
				if(f.createNewFile())
				{
					System.out.println("File Created Successfully");
				}
				else {
					System.out.println("File Not found");
				}
			}
			catch(IOException i)
			{
				System.out.println("Exception is handeled");
			}
		}
	//Taking data from user
		void getdata()
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("\t\t======================================");
				System.out.println("\t\t||            Taking Data           ||");
				System.out.println("\t\t======================================");
				System.out.print("\tEnter Name:");
				name = sc.next();
				System.out.print("\tEnter ID:");
				id = sc.next();
				System.out.print("\tEnter Rollno:");
				rollno = sc.next();
				System.out.print("\tCourse:");
				course = sc.next();
				System.out.print("\tBranch:");
				branch = sc.next();
				System.out.print("\tEnter Address:");
				address = sc.next();
				
		}
	//Displaying data
		void display()
		{
			int i=1;
			i++;
			System.out.println("-----------------------Data --"+i+"------------------------");
			System.out.println(name+"\t"+id+"\t"+rollno+"\t"+course+"\t"+branch+"\t"+address);
			System.out.println("-----------------------------------------------------------");
			
		}
		
		void write()
		{
			try
			{
				FileWriter f = new FileWriter("StudentDatabse.txt",true);
				try
				{	int i=0;
					i++;
					f.write("-----------------------Data" +i+"------------------------\n");
					f.write("NAME\t\t:"+name+"\n"+"ID\t\t:"+id+"\n"+"Rollno\t\t:"+rollno+"\n"+"Course\t\t:"+course+"\n"+"Branch\t\t:"+branch+"\n"+"Address\t\t:"+address+"\n");
					System.out.println("\n-----------------------------------------------------------\n");
				}
				finally
				{
					f.close();
				}
			}
			catch(IOException e)
			{
				System.out.println("Exception is handeled");
			}
		}
		
		void delete() throws IOException
		{
			File f = new File("StudentDatabse.txt");
			f.delete();
			System.out.println("All Data Is Deleted Successfully");
		}
	/*	void read()
		{
			try
			{
				try {
					FileReader re = new FileReader("StudentDatabse.txt");
					int i;
					while((i=re.read())!=-1)
						{
							System.out.print((char)i);
						}
				}
				finally
				{
					re.close();
				}
			}
			catch(IOException i)
			{
				System.out.println("Exception is handeled");
			}
		}
		
	*/
	//Deleting data
	//	void delete()
	//	{
			
	//	}s

}
