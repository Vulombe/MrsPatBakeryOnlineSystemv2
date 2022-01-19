package za.co.bakery.listener;

<<<<<<< HEAD
=======
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import za.co.bakery.manager.DBPoolManagerBasic;

/**
 *
 * @author Studio13
 */
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();

        String driver = sc.getInitParameter("driver");
        String url = sc.getInitParameter("url");
        String user_name = sc.getInitParameter("user_name");
        String password = sc.getInitParameter("password");
        String database = sc.getInitParameter("database");
        String sslval = sc.getInitParameter("sslsec");
<<<<<<< HEAD
        DBPoolManagerBasic db = new DBPoolManagerBasic(driver, url + database + sslval, user_name, password);
=======
        DBPoolManagerBasic db = new DBPoolManagerBasic(driver, url + database+sslval, user_name, password);
>>>>>>> ebdf52d7c2de03e58c654e3f009d94bc74e1ae0b
        //       DBPoolManagerBasic db = new DBPoolManagerBasic();
        sc.setAttribute("dbconn", db);
        System.out.println("Context initialised ------------------------------------------");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        DBPoolManagerBasic db = (DBPoolManagerBasic) sc.getAttribute("dbconn");
        if (db != null) {
            db.closePool();
        }
    }

}
