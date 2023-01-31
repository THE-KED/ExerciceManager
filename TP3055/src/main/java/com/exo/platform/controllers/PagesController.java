package com.exo.platform.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import com.exo.platform.dao.ExerciceDaoImpl;
import com.exo.platform.dao.entitys.Account;
import com.exo.platform.dao.entitys.Exercice;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/ExoManager")
public class PagesController {
	
	@Autowired
	ExerciceDaoImpl exorepo;

	
	@GetMapping("/")
	public String Default(Model model) {
		
		Account account = new Account();
		model.addAttribute("account",account);	
		
		return "home";
	}
	
	@GetMapping("/home")
	public String RooteToHome(Model model) {

		Account account = new Account();
		model.addAttribute("account",account);		
		
		return "home";
	}
	
	@GetMapping("/eleve")
	public String RooteToEleve(Model model) {
		
		Exercice exo = new Exercice();
		
		model.addAttribute("exo",exo);
				
		return "eleve";
	}
	
	@PostMapping("eleve")
	public String submitexo(@ModelAttribute(name = "exo") Exercice exo,
							@RequestParam("file") MultipartFile file,
							Model model) throws IOException{
		
		Exercice Exo = new Exercice();
		byte[] bytes = file.getBytes();
		
		Exo.setTitre(exo.getTitre());
		Exo.setDescription(StringUtils.cleanPath(file.getOriginalFilename()));
		Exo.setFile(bytes);
		
		exorepo.save(Exo);
				
		return "eleve";
	}
	
	@GetMapping("/moderateur")
	public String RooteToModerateur() {
		return "moderateur";
	}
	
	@GetMapping("/professeur")
	public String RooteToProfesseur() {
		return "professeur";
	}
	
	@PostMapping("/professeur")
	public String ToProfesseur(@ModelAttribute(name = "account") Account acc , Model model) {
		
		model.addAttribute("account",acc);
		
		return "professeur";
	}
	
	
	@InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder)
            throws ServletException {
            
            // Convert multipart object to byte[]
            binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
            
        }
	
}
