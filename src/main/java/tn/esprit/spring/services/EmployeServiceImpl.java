package tn.esprit.spring.services;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.repository.EmployeRepository;

@Service
public class EmployeServiceImpl{

	@Autowired
	EmployeRepository EmployeRepository;

	private static final Logger L = LogManager.getLogger(EmployeServiceImpl.class);
	
	public List<Employe> retrieveAllEmployes() { 
		List<Employe> Employes = null; 
		try {
	
			// TODO Log à ajouter en début de la méthode 
			L.info("In Methode RetriveAllEmployes");
			Employes = (List<Employe>) EmployeRepository.findAll();  
			L.debug("Connexion a la db ok");
			for (Employe Employe : Employes) {
				// TODO Log à ajouter pour affiher chaque Employe dans les logs 
				L.debug("Employe :" + Employe.getNom());
			} 
			// TODO Log à ajouter à la fin de la méthode 
			L.info("fin de méthode avec succées");
		}catch (Exception e) {
			// TODO Log à ajouter pour gérer les erreurs 
			L.error("out avec error :" + e);
		}

		return Employes;
	}


	public Employe addEmploye(Employe e) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode addEmploye");
		Employe u_saved = EmployeRepository.save(e); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("Out of Methode addEmploye w.e");
		return u_saved; 
	}

	public Employe updateEmploye(Employe e) { 
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode updateEmploye");
		Employe u_saved = EmployeRepository.save(e); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("Out of Methode updateEmploye w.e");
		return u_saved; 
	}

	public void deleteEmploye(String id) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode deleteEmploye");
		EmployeRepository.deleteById(Long.parseLong(id)); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("out of Methode deleteEmploye w.e");
	}

	public Employe retrieveEmploye(String id) {
		// TODO Log à ajouter en début de la méthode 
		L.info("In Methode retrieveEmploye");
		//Employe u =  EmployeRepository.findById(Long.parseLong(id)).orElse(null);
		Employe u =  EmployeRepository.findById(Long.parseLong(id)).get(); 
		// TODO Log à ajouter à la fin de la méthode 
		L.info("Out of Methode retrieveEmploye w.e");
		return u; 
	}

}
