package com.livecoding.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livecoding.model.Alunno;

@Repository
public interface AlunnoRepository extends JpaRepository<Alunno, Integer>
{
	public Alunno findByName(String name);
}
