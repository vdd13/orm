package pl.dom.orm.repo;

import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OsobaDAO implements DAO<OsobaHbm> {

	SessionFactory sessionFactory;
	
	
	public Collection<OsobaHbm> getOsobyByName(String imie) {
		return sessionFactory.getCurrentSession()
//				.createQuery("from OsobaHbm where imie = ?1" )
//				.setParameter(1, imie)
//				.list();
				.createNativeQuery("select * from osoba where imie = :imie", OsobaHbm.class)
				.setParameter("imie", imie)
				.list();
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public OsobaHbm find(int i) {
//		sessionFactory.getCurrentSession().get(OsobaHbm.class, sessionFactory);
		return (OsobaHbm) sessionFactory.getCurrentSession().get("OsobaHbm", i);
	}

	@Override
	public List<OsobaHbm> findAll() {
		return sessionFactory.getCurrentSession().createNativeQuery("select * from osoba", OsobaHbm.class).list();
	}

	@Override
	public void save(OsobaHbm t) {
		sessionFactory.getCurrentSession().persist(t);
		
	}

	@Override
	public void update(OsobaHbm t, String[] params) {
		sessionFactory.getCurrentSession().merge(t);
		
	}

	@Override
	public void delete(OsobaHbm t) {
		sessionFactory.getCurrentSession().remove(t);
	}
	
}
