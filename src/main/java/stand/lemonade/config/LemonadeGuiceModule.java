package stand.lemonade.config;
import stand.lemonade.dao.LanguageDao;
import stand.lemonade.dao.LanguageDaoImpl;
import stand.lemonade.service.LanguageService;
import stand.lemonade.service.LanguageServiceImpl;

import com.google.inject.AbstractModule;
public class LemonadeGuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(LanguageService.class).to(LanguageServiceImpl.class);
		bind(LanguageDao.class).to(LanguageDaoImpl.class);
	}

}
