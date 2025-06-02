package in.soa.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.soa.beans.Vehicle;
public class Transport {
    public static void main(String[] args) {
    	String config_loc="/in/soa/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Vehicle car = (Vehicle) context.getBean("car");
        Vehicle bike = (Vehicle) context.getBean("bike");

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}