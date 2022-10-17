package tw.com.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EmProvider {
	
	//將EntityManager實例交給容器管理 
	//交易也交給容器管理
	@PersistenceContext
	@Produces
	private EntityManager em;
}
