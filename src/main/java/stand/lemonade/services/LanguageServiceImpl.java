package stand.lemonade.services;

import java.util.ArrayList;
import java.util.List;

import stand.lemonade.dal.LanguageDalImpl;
import stand.lemonade.entities.Language;
import stand.lemonade.models.LanguageModel;

import com.google.inject.Inject;

public class LanguageServiceImpl implements LanguageService {

	@Inject
	LanguageDalImpl languageDao;

	@Override
	public List<LanguageModel> getAllLanguages() {

		List<Language> languages = languageDao.getAllLanguages();

		List<LanguageModel> models = new ArrayList<LanguageModel>();

		for (Language l : languages) {
			models.add(new LanguageModel(l));
		}

		return models;

	}
}
