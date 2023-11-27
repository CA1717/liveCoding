package com.livecoding.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livecoding.model.Alunno;
import com.livecoding.repository.AlunnoRepository;

@Service
public class AlunnoServiceImpl implements AlunnoService
{

	@Autowired
	private AlunnoRepository alunnoRepo;
	
	
	
	@Override
	public Alunno findById(int id){
		// TODO Auto-generated method stub
		return alunnoRepo.findById(id).orElseThrow(() -> new NoSuchElementException("Utente non trovato"));
	}

	@Override
	public List<Alunno> findAll() {
		// TODO Auto-generated method stub
		return alunnoRepo.findAll();
	}

	@Override
	public Alunno saveAlunno(Alunno a) {
		// TODO Auto-generated method stub
		return alunnoRepo.save(a);
	}

	@Override
	public Alunno updateAlunno(Alunno a) {
		// TODO Auto-generated method stub
		return alunnoRepo.save(a);
	}

	@Override
	public void deleteAlunno(int id) {
		// TODO Auto-generated method stub
		alunnoRepo.deleteById(id);
	}

	@Override
	public Alunno findByName(String name) {
		// TODO Auto-generated method stub
		return alunnoRepo.findByName(name);
	}

	@Override
	public String getNameParam(String par) {
		// TODO Auto-generated method stub
		return alunnoRepo.findNameByParam(par);
	}

}
