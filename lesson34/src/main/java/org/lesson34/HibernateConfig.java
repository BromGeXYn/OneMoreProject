package org.lesson34;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.lesson34.entity.PersonEntity;
import org.lesson34.entity.PhoneEntity;

public class HibernateConfig {

    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/lesson34");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "617835");
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty("hibernate.show_sql", "true");

//        configuration.setProperty("hibernate.hbm2ddl.auto", "update");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create-drop");

        configuration.addAnnotatedClass(PersonEntity.class);
        configuration.addAnnotatedClass(PhoneEntity.class);

        sessionFactory = configuration.buildSessionFactory();
    }
    public static Session create() {
        return sessionFactory.openSession();
    }

}
