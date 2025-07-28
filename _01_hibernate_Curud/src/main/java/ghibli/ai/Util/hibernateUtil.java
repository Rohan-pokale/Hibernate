package ghibli.ai.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {

    private static Configuration cfg=new Configuration();
    private static SessionFactory sessionFactory;

    public static org.hibernate.SessionFactory getSessionFactory() {

        if(sessionFactory==null){
            cfg.configure("hibernate.cfg.xml");
            sessionFactory=cfg.buildSessionFactory();
        }

        return sessionFactory;
    }
}
