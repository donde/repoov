package ma.moov.core.domaine;

import java.util.HashSet;
import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class User {
	
	private String login;
	private String phone;
	private String email;
	@Id
	private ObjectId id;
	private Set<Adress> adresses;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public Set<Adress> getAdresses() {
		return adresses;
	}
	public void setAdresses(Set<Adress> adresses) {
		this.adresses = adresses;
	}
	public void addAdress(Adress adress) {
		if(adresses == null){
			adresses = new HashSet<Adress>();
		}
		adresses.add(adress);
	}
}
