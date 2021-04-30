package hibernate_introduction;

import hibernate_introduction.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

/*          Employee emp = new Employee("Valeriu", "Zdrobau", "IT", 4000);   Insert object in database
            session.save(emp);*/

/*            Employee emp1 = session.get(Employee.class,1);    Select object by id and print it
            System.out.println(emp1);*/

/*            List<Employee> allEmployees = session.createQuery("from Employee").getResultList();  Select all object from one table and print them
            for (Employee e: allEmployees){
                System.out.println(e);
            }*/

            /*List<Employee> someEmployees = session.createQuery("from Employee where firstName = 'Sergiu'").getResultList(); Select some object, depending by column with HQL
            for (Employee e:someEmployees){
                System.out.println(e);
            }*/

            /*Employee emp2 = session.get(Employee.class, 2);   Update object by id
            emp2.setSalary(1500);*/

           // session.createQuery("update Employee set salary = 3800 where firstName='Valeriu'").executeUpdate(); Update object with Hibernate Query Language

            /*Employee emp1 = session.get(Employee.class, 1); DELETE BY ID
             session.delete(emp1);*/

            // session.createQuery("delete Employee where firstName = 'Sergiu' AND salary>1300").executeUpdate();   Delete with HQL


            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }


    }
}
