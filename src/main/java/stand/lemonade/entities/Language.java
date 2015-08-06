package stand.lemonade.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Language{

	@Id
    private Long id;
    
    private String name;

	private String description;

	public Language(String name) {
		this.setName(name);
	}

	public Language() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


    public static final String GERMAN = "GERMAN";
    public static final String MANDARIN = "MANDARIN";
    public static final String CHINESE = "CHINESE";
    public static final String SPANISH = "SPANISH";
    public static final String ENGLISH = "ENGLISH";
    public static final String HINDI = "HINDI";
    public static final String ARABIC = "ARABIC";
    public static final String PORTUGUESE = "PORTUGUESE";
    public static final String BENGALI = "BENGALI";
    public static final String RUSSIAN = "RUSSIAN";
    public static final String JAPANESE = "JAPANESE";
    public static final String PUNJABI = "PUNJABI";
    public static final String KOREAN = "KOREAN";
    public static final String FRENCH = "FRENCH";
    public static final String PERSIAN = "PERSIAN";
    public static final String TURKISH = "TURKISH";
    public static final String ITALIAN = "ITALIAN";
    public static final String CANTONESE = "CANTONESE";
    public static final String POLISH = "POLISH";
    public static final String DUTCH = "DUTCH";
    public static final String GREEK = "GREEK";
}
