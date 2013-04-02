package ma.moov.core.domaine.dao;

import ma.moov.core.domaine.Adress;
import ma.moov.core.domaine.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void insertContact(User user) {

		createPersonCollection();

		mongoTemplate.insert(user);

	}
	
	public void insertAdress(Adress user) {

		createAdressCollection();

		mongoTemplate.insert(user);

	}
	public void createAdressCollection() {
		if (!mongoTemplate.collectionExists(Adress.class)) {
			mongoTemplate.createCollection(Adress.class);
		}
	}

	public void createPersonCollection() {
		if (!mongoTemplate.collectionExists(User.class)) {
			mongoTemplate.createCollection(User.class);
		}
	}

}
