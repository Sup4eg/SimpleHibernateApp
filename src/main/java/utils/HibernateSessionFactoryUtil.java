package utils;

import models.Auto;
import models.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactoryUtil {
    public static SessionFactory sessionFactory;

    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            System.out.println("Exception");
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }
}

//    public void SessionFactory setUp() {
//        Object sessionFactory;
//        if (sessionFactory == null) {
////                Configuration configuration = new Configuration().configure();
////                configuration.addAnnotatedClass(User.class);
////                configuration.addAnnotatedClass(Auto.class);
////                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
////                sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
//            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                    .configure()
//                    .build();
//            try {
//                sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//
//            } catch (Exception e) {
//                System.out.println("Исключение!" + e);
//            }
//        }
//        return sessionFactory;
//
//    }
