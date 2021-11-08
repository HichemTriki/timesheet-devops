package tn.esprit.spring.services;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Employe;




@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class EmployeServicelmplTest {

	@Autowired
	IEmployeService us;

	@Test
	@Order(1)
	public void testRetrieveAllEmployes() {
	  //  List<Employe> listEmployes = us.retrieveAllEmployes();
	   // Assertions.assertEquals(0, listEmployes.size());
	}
	
	/*public void testaddEmploye(){

		Employe u_saved = us.addEmploye(u_saved);
        Assertions.assertIterableEquals(u_saved, u_saved.getId, "pas ajouté");
    }
	@Test
	@Order(2)
	public void testAddEmploye() throws ParseException {
	    SimpleDateFormat dateFormat = new SimpleDateFormat('yyyy-MM-dd');
	    date d = 
	}*/
}
