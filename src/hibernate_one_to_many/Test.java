package hibernate_one_to_many;

import hibernate_one_to_many.entity.Department;

import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            /*Department dep1 = new Department("IT", 1800, 1200);  Relation one-to-many bi-directional, adding department with employee   cascade = CascadeType.ALL
            Employee emp1 = new Employee("Ion", "Dohn", 1600);
            dep1.addEmployee(emp1);
            session.save(dep1);*/


/*            Department dep = session.get(Department.class, 1);
            session.delete(dep);*/

/*            Employee emp = new Employee("John", "Dohn", 1400);    Relation many-to-one, bidirectional, adding employee with new department  cascade = CascadeType.ALL
            Department dep = new Department("Sales", 1600, 1300);
            emp.setDepartment(dep);
            session.save(emp);*/

/*            Employee emp = new Employee("John", "Kenedy", 1450);    Relation many-to-one, bidirectional, adding employee with existing department   cascade = CascadeType.ALL
            Department dep = session.get(Department.class, 2);
            emp.setDepartment(dep);
            session.save(emp);*/

/*            Employee emp = session.get(Employee.class, 3);       Bidirectional Delete employee without department (@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}))
            session.delete(emp);*/

/*            Department dep = session.get(Department.class, 6);   Bidirectional Delete Department where Employee.department_id == Department.id, need to change Employee column, cannot delete or update a parent row: a foreign key constraint fails
            session.createQuery("update Employee set department_id = 6  where department_id = 2").executeUpdate();
            session.delete(dep);*/



            // Difference between Bi and Uni in Employee class and Department Class. Just Department knows about Employee.
            // From Employee remove department field with all annotations, department set and get.
            // From Department delete employee.setDepartment(this) from addEmployee function. Make sure no mappedBy annotation, but Join Column(always foreign key, even if it's from target table) instead





          /*  Department dep1 = new Department("IT", 1800, 1200);  Unidirectional  Adding Employee in new Department with persist, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} doesn't work save function
            Employee emp1 = new Employee("John", "Dohn", 1600);
            dep1.addEmployee(emp1);
            session.persist(dep1);*/



            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }

}
