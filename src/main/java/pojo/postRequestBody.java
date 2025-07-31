package pojo;

import java.util.List;

//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//@JsonIgnoreProperties(ignoreUnknown = true)
public class postRequestBody {
	private String name;
	private String job;
	private List<String> languages;
	private List<CityRequest> cities;
	
	public List<CityRequest> getCities() {
		return cities;
	}
	public void setCities(List<CityRequest> cities) {
		this.cities = cities;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
