package stand.lemonade.models;

import stand.lemonade.entities.Language;

public class LanguageModel {

	Long id;
	
	String language;
	
	public LanguageModel(Language entity) {
		this.id = entity.getId();
		this.language = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
