import java.util.*;
import java.io.IOException;

public class Smain extends StudentDatabase {

	public static void main(String[] args)throws IOException {
		int choice = 0;
		
		Smain m = new Smain();
		
		//s.CreateFile();
	/*	m.getdata();
		m.display();
		*/
		do {
			Scanner sc = new Scanner(System.in);
				System.out.println("1.Create New File");
				System.out.println("2.Enter Data");
				System.out.println("3.Display Data");
				System.out.println("4.Write In File");
				System.out.println("5.Read Data from File");
				System.out.println("6.Delete file");
				System.out.println("7.Exit");
				System.out.println("-------------------------------------");
				System.out.print("Enter your choice:");
				choice = sc.nextInt();
				System.out.println("-------------------------------------");
				switch(choice)
				{
					case 1:
						m.CreateFile();
						break;
					case 2:
						m.getdata();
						break;
					case 3:
						m.display();
						break;
					case 4:
						m.write();
						break;
					case 5:
						//m.read();
						break;
					case 6:
						m.delete();
						break;
				}
			}while(choice!=7);
	}
	
}
