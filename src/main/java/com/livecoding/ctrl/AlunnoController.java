package com.livecoding.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.livecoding.model.Alunno;
import com.livecoding.service.AlunnoService;

@RestController
@RequestMapping("/alunno")
public class AlunnoController
{
	@Autowired
	private AlunnoService alunnoService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Alunno>> findAll()
	{
		return new ResponseEntity<List<Alunno>>(alunnoService.findAll(),HttpStatus.OK);
	}
	
//	@GetMapping("/findByName/{name}")
//	public ResponseEntity<?> findByName(@PathVariable String name)
//	{
//			if(alunnoService.findByName(name) != null)
//			{
//				return new ResponseEntity<Alunno>(alunnoService.findByName(name),HttpStatus.OK);
//			}else
//			{
//				return new ResponseEntity<String>("Alunno con questo nome non trovato",HttpStatus.NOT_FOUND);
//			}
//	}
	
	@GetMapping("/findByName/{name}")
	public ResponseEntity<Alunno> findByName(@PathVariable String name)
	{
		return new ResponseEntity<Alunno>(alunnoService.findByName(name),HttpStatus.OK);
	}
	
	@GetMapping("/findAlunno/{id}")
	public ResponseEntity<Alunno> findById(@PathVariable int id)
	{
		return new ResponseEntity<Alunno>(alunnoService.findById(id),HttpStatus.OK);
	}
	
	
//	@PostMapping("/save")
//	public ResponseEntity<Alunno> saveAlunno(@RequestBody Alunno a)
//	{
//		return new ResponseEntity<Alunno>(alunnoService.saveAlunno(a),HttpStatus.OK);
//	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveAlunno(@RequestBody Alunno a)
	{
		alunnoService.saveAlunno(a);
		return new ResponseEntity<String>("Alunno salvato con successo",HttpStatus.OK);
	}
	
	
//	@PutMapping("/update")
//	public ResponseEntity<Alunno> updateAlunno(@RequestBody Alunno a)
//	{
//		return new ResponseEntity<Alunno>(alunnoService.saveAlunno(a),HttpStatus.OK);
//	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateAlunno(@RequestBody Alunno a)
	{
		alunnoService.saveAlunno(a);
		return new ResponseEntity<String>("Alunno aggiornato con successo",HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteAlunno(@RequestParam int id)
	{
		alunnoService.deleteAlunno(id);
		
		return new ResponseEntity<String>("Alunno eliminato con successo",HttpStatus.OK);
	}
	
	
}
