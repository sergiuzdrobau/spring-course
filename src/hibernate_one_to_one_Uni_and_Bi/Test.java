package hibernate_one_to_one_Uni_and_Bi;



import hibernate_one_to_one_Uni_and_Bi.entity.Detail;
import hibernate_one_to_one_Uni_and_Bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

/*            Employee emp = new Employee("Sergiu", "Zdrobau", "Slaughterhall", 1400);   Insert 2 objects in 2 different tables, relation one to one, uni-directional , one of them automatic (cascade job)
            Detail empDetail = new Detail("Dungannon", "07397019381", "sergiuzdrobau@gmail.com");
            emp.setEmpDetail(empDetail);
            session.save(emp);*/

/*

            Employee emp = session.get(Employee.class, 1); Get details of an employee, from another table (cascade)
            System.out.println(emp.getEmpDetail());
*/

/*            List<Employee> emp = session.createQuery("from Employee where firstName='Sergio'").getResultList();  Delete Employee and corresponding details(cascade), uni-directional
            for (Employee e:emp){
                session.delete(e);
            }*/


/*            Employee emp = new Employee("Sergiyu", "Zdrobau", "Slaughterhall", 1500);                     Save 2 objects without cascade / or adding cascade for Detail Class and save just Detail (Bi-directional)
            Detail empDetail = new Detail("Dungannon", "07397019384", "sergiuzdrobau@gmail.com");
            emp.setEmpDetail(empDetail);
            empDetail.setEmployee(emp);
            session.save(emp);
            session.save(empDetail);*/

/*
            session.createQuery("update Employee set details_id = 5 where details_id = 6 ").executeUpdate();            In case of delete Details(with cascade), both tables a changed. Without cascade we need to change details_id(foreign_key) != details.id
            Detail detail = session.get(Detail.class, 6);

            session.delete(detail);
            System.out.println(detail);
*/


            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }


    }
}

