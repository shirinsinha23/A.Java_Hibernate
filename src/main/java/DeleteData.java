import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
        
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession(); //model class object
		Transaction transaction=session.beginTransaction(); // Db CRUD
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Id");
		int id=scanner.nextInt();
		Employee employee=session.get(Employee.class, id);
		
		session.delete(employee);
		transaction.commit();
		session.close();
		System.out.println("Data updated Successfully");
	}

}
