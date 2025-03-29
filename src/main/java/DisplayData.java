import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DisplayData {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
        
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Query query=session.createQuery("FROM Employee");
		List<Employee>list=query.list();
        for(Employee employee:list)
        {
        	System.out.println(employee.getId()+" "+employee.getName());
        }
	}

}
