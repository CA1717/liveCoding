package com.livecoding.service;

import java.util.List;
import java.util.Optional;

import com.livecoding.model.Alunno;

public interface AlunnoService
{
	public Alunno findById(int id);
	
	public Alunno findByName(String name);
	
	public List<Alunno> findAll();
	
	public Alunno saveAlunno(Alunno a);
	
	public Alunno updateAlunno(Alunno a);
	
	public void deleteAlunno(int id);
}
