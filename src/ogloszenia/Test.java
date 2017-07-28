package ogloszenia;

import ogloszenia.model.User;
import org.hibernate.Session;

import ogloszenia.model.Advertisement;
import ogloszeniar.hibernate.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.openSession().getSession();
		
		Advertisement o  = s.find(Advertisement.class, 1);
		//User u = s.find(User.class, 1);

		s.close();
	}

}
