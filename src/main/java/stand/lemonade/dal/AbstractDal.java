package stand.lemonade.dal;

import javax.persistence.EntityManager;

import com.google.inject.Provider;

public abstract class AbstractDal {

	protected final EntityManager em;

	public AbstractDal(Provider<EntityManager> emf) {
		this.em=emf.get();
	}
	
}
