package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();


/*            Section sec1 = new Section("Fotbal");             Adding section with 3 childs cascade.type=all (save method)
            Child child1 = new Child("Sergiu", 10);
            Child child2 = new Child("Valeriu", 13);
            Child child3 = new Child("Vasile", 12);
            sec1.addChild(child1);
            sec1.addChild(child2);
            sec1.addChild(child3);
            session.save(sec1);*/

/*            Child child = session.get(Child.class, 1);   Deleted all children and related section, because of cascade.type=all
            session.delete(child);*/


/*            Section sec1 = new Section("Voley");         Adding section with 3 childs cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH} (persist method)
            Child child1 = new Child("Ion", 14);
            Child child2 = new Child("Gheorghe", 11);
            Child child3 = new Child("Mihail", 9);
            sec1.addChild(child1);
            sec1.addChild(child2);
            sec1.addChild(child3);
            session.persist(sec1);*/

/*            Child child = session.get(Child.class, 8);    Delete just one children and one row from child_section table (Join Table) cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}
            session.delete(child);*/



            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }




    }
}
