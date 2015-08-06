package stand.lemonade.service;

import java.util.List;

import stand.lemonade.dal.LanguageDalImpl;
import stand.lemonade.entities.Language;

import com.google.inject.Inject;

public class LanguageServiceImpl implements LanguageService {

	@Inject
	LanguageDalImpl languageDao;

	@Override
	public List<Language> getAllLanguages() {

		return languageDao.getAllLanguages();

	}
}
