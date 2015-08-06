package stand.lemonade.config;
import stand.lemonade.dal.LanguageDal;
import stand.lemonade.dal.LanguageDalImpl;
import stand.lemonade.service.LanguageService;
import stand.lemonade.service.LanguageServiceImpl;

import com.google.inject.AbstractModule;
public class LemonadeGuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(LanguageService.class).to(LanguageServiceImpl.class);
		bind(LanguageDal.class).to(LanguageDalImpl.class);
	}

}
