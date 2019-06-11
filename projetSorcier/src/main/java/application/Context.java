package application;

import javax.persistence.*;

public class Context {

	private static EntityManagerFactory emf;
	private static Context _instance;

	private Context() {
		emf = Persistence.createEntityManagerFactory("maBase");
	}

	public static Context getInstance() {

		if (_instance == null) {
			_instance = new Context();
		}
		return _instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public static void destroy() {
		
		if (_instance!=null)  
		emf.close();
		_instance = null;
	}
}
