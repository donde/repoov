package ma.moov.core.domaine;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class User {
	private String login;
	private String phone;
	private String email;
	@Id
	private ObjectId id;
	@DBRef
	private List<Adress> adresses;
	
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
	public List<Adress> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}
}
