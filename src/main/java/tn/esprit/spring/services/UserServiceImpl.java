package tn.esprit.spring.services;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;

	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);
	
	@Override
	public List<User> retrieveAllUsers() { 
		List<User> users = null; 
		try {
	
			// TODO Log à ajouter en début de la méthode 
			L.info("In Methode RetriveAllUsers");
			users = (List<User>) userRepository.findAll();  
			L.debug("Connexion a la db ok");
			for (User user : users) {
				// TODO Log à ajouter pour affiher chaque user dans les logs 
				L.debug("user :" + user.getLastName());
			} 
			// TODO Log à ajouter à la fin de la méthode 
			L.info("fin de méthode avec succées");
		}catch (Exception e) {
			// TODO Log à ajouter pour gérer les erreurs 
			L.error("out avec error :" + e);
		}

		return users;
	}


	@Override
	public User addUser(User u) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode addUser");
		User u_saved = userRepository.save(u); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("Out of Methode addUser w.e");
		return u_saved; 
	}

	@Override 
	public User updateUser(User u) { 
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode updateUser");
		User u_saved = userRepository.save(u); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("Out of Methode updateUser w.e");
		return u_saved; 
	}

	@Override
	public void deleteUser(String id) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode deleteUser");
		userRepository.deleteById(Long.parseLong(id)); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("out of Methode deleteUser w.e");
	}

	@Override
	public User retrieveUser(String id) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode retrieveUser");
		//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		User u =  userRepository.findById(Long.parseLong(id)).get(); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("Out of Methode retrieveUser w.e");
		return u; 
	}

}
