package stand.lemonade.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import stand.lemonade.entities.Language;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class LanguageDalImpl extends AbstractDal implements LanguageDal {

	@Inject
	public LanguageDalImpl(Provider<EntityManager> emf) {
		super(emf);
	}

	@Transactional
	@Override
	public List<Language> getAllLanguages() {
		TypedQuery<Language> query = em.createQuery(
				"FROM Language AS l", Language.class);
		return query.getResultList();
	}

}
