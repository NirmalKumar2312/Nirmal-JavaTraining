package JFS_JFS_Hlbernate_XmlConfig;

import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration().configure().addAnnotatedClass(Laptop.class);
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(
				config.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory=config.buildSessionFactory(serviceRegistry);
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	}
	}

}
