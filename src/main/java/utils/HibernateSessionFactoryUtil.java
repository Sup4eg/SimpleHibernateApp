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

    public static SessionFactory setUp()  {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Auto.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
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
