package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.jpa.MyUser;

@Stateless
public class MyUserBean implements MyUserBeanLocal {
	@Inject
	private EntityManager em; 
	@Override
	public boolean login(MyUser myUser) {
		// TODO Auto-generated method stub
		MyUser qMyUser =   findUserByAccount(myUser.getAccount());	
		return myUser.equals(qMyUser);
	}

	@Override
	public boolean regisrter(MyUser myUser) {
		// TODO Auto-generated method stub
		try {
			em.persist(myUser);	
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		return false;
	}

	@Override
	public MyUser findUserByAccount(String account) {
		// TODO Auto-generated method stub
		
		MyUser myUser = null;
		TypedQuery<MyUser> query =   em.createNamedQuery("findMyUser",MyUser.class);
		query.setParameter("account", account);
		myUser =  query.getSingleResult();
		return myUser;
	}

	@Override
	public boolean detetUser(MyUser myUser) {
		// TODO Auto-generated method stub
		myUser = em.merge(myUser);
		try {
			em.remove(myUser);
			return true;
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		return false;
	}

}
