import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.navercorp.song.dao.CustomerDAO;
import com.navercorp.song.dto.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(12, "song", 27);
        customerDAO.insert(customer);
    	
        Customer customer1 = customerDAO.findByCustomerId(12);
        System.out.println(customer1);
        System.out.println(customer1.getCustId() + " " + customer1.getName() + " " + customer1.getAge());
        
    }
}