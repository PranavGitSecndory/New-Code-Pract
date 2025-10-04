package mini_application_Id_genration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bank_Operation {
	  private final String Main_file = "Main.txt";
	  private final String TRANSACTION_FILE = "Transaction.txt";
	  Scanner sc=new Scanner(System.in);
	public void signup()
	{
		try {
			System.out.print("FIRST NAME: ");
            String firstName = sc.nextLine();
            System.out.print("SURNAME: ");
            String surname = sc.nextLine();
            System.out.print("PASSWORD: ");
            String password = sc.nextLine();
            System.out.print("MOBILE NO: ");
            String mobileNo = sc.nextLine();
            System.out.print("AGE: ");
            String age = sc.nextLine();
            System.out.print("MIN BALANCE AMT: ");
            double minBalance = Double.parseDouble(sc.nextLine());
			System.out.println("");
			
			int id=100;
			File file=new File(Main_file);
			if(file.exists())
			{
				FileReader fr=new FileReader(file);
				BufferedReader br =new BufferedReader(fr);
				String data=br.readLine();
				String lastline=null;
				
				while(data !=null)
				{
					lastline=data;
					data=br.readLine();
				}
				br.close();
				if (lastline != null) {
             
					StringTokenizer st=new StringTokenizer(lastline,"#");
					if (st.hasMoreTokens()) {
	                    String lastId = st.nextToken();
	                    if (lastId==lastId) {
	                        id = Integer.parseInt(lastId) + 1; 
	                    }
	                }
                }
			}
			
			FileWriter fw=new FileWriter(file,true);
//			fw.write(id + "#" + firstName + "#" + surname + 
//					"#" + password + "#" + mobileNo + "#" 
//					+ age + "#" + (int)minBalance + "\n");
//
		fw.write(id);
		fw.write("#");
		fw.write(firstName);
		fw.write("#");
			fw.write(surname);
		fw.write("#");
			fw.write(password);
			fw.write("#");
			fw.write(mobileNo);
			fw.write("#");
			fw.write(age);
			fw.write("#");
			fw.write((int) minBalance);
			
			fw.close();
			
			System.out.println("singn up scucessfull");
            System.out.println("your costomer id is  = " + id);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void Login()
	{
		
	}
}
