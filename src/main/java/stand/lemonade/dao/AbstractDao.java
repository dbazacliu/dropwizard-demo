package stand.lemonade.dao;

import javax.persistence.EntityManager;

import com.google.inject.Provider;

public abstract class AbstractDao {

	protected final EntityManager em;

	public AbstractDao(Provider<EntityManager> emf) {
		this.em=emf.get();
	}
	
}
