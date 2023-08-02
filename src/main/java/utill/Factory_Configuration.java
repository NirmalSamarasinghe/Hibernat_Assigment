package utill;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory_Configuration {
    private static Factory_Configuration factoryConfiguration;
    private static SessionFactory sessionFactory;

    private Factory_Configuration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Book.class);
        sessionFactory=configuration.buildSessionFactory();
    }
    public static Factory_Configuration getInstance(){
        return(factoryConfiguration == null)?
                factoryConfiguration= new Factory_Configuration():factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }


}