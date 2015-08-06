package stand.lemonade.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import stand.lemonade.models.LanguageModel;
import stand.lemonade.service.LanguageService;

import com.google.inject.Inject;

@Path("/language")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LanguageResource {

	@Inject
	private LanguageService languageService;

	public LanguageResource() {
	}

	@GET
	public List<LanguageModel> list() {
		List<LanguageModel> languages = languageService.getAllLanguages();
		return languages;
	}

}
