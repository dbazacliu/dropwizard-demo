package stand.lemonade.service;

import java.util.List;

import stand.lemonade.dao.LanguageDaoImpl;
import stand.lemonade.entities.Language;

import com.google.inject.Inject;

public class LanguageServiceImpl implements LanguageService {

	@Inject
	LanguageDaoImpl languageDao;

	@Override
	public List<Language> getAllLanguages() {

		return languageDao.getAllLanguages();

	}
}
