package com.exo.platform.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.exo.platform.dao.entitys.Account;
import com.exo.platform.dao.entitys.Exercice;
import com.exo.platform.dao.entitys.ExerciceRejeter;
import com.exo.platform.dao.entitys.Student;
import com.exo.platform.dao.entitys.User;



@SpringBootTest
class UserTest {

	@Autowired
	private AccountDaoImpl AccRepo;
	@Autowired
	private ExerciceDaoImpl ExoRepo;
	@Autowired
	private ExerciceRejeterDaoImpl ExoRRepo;
	@Autowired
	private StudentDaoImpl StuRepo;
	
	@Test
	void loadtest() {
		Exercice exo = new Exercice();
		ExerciceRejeter exoR = new ExerciceRejeter();
		exo.setClasse("6eme");
		exo.setDateImport(new Date());
		exo.setDescription("test");
		exo.setFile(null);
		
//		exo =ExoRepo.save(exo);
		
		exoR.setClasse("6eme");
		exoR.setDateImport(new Date());
		exoR.setDescription("test");
		exoR.setFile(null);
		exoR.setMotif("rien");
		
//		exoR = ExoRRepo.save(exoR);
		
		ArrayList<Exercice> exos = new ArrayList<Exercice>();
		ArrayList<ExerciceRejeter> exoRs = new ArrayList<ExerciceRejeter>();
		exos.add(exo);
		exoRs.add(exoR);
		
		
//		User user ;
		Student stu = new Student();;
		stu.setBornThe(new Date());
		stu.setName("Eric");
		stu.setExercices(exos);
		stu.setExercicesRejeter(exoRs);
		Account acc = new Account();
		acc.setUser(StuRepo.load(3L));
				
		assertEquals("6eme", ((Student) acc.getUser()).getExercices().get(0).getClasse());
	}

}
