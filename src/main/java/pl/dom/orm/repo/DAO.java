package pl.dom.orm.repo;

import java.util.List;

public interface DAO<T> {

	T find(int i);
	List<T> findAll();
	void save(T t);
	void update(T t, String[] params);
	void delete(T t);
	
}
