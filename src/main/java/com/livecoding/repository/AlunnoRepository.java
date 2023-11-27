package com.livecoding.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.livecoding.model.Alunno;

@Repository
public interface AlunnoRepository extends JpaRepository<Alunno, Integer>
{

	@Query("SELECT a.name FROM Alunno a WHERE a.name LIKE (%:parametro%)")
	public String findNameByParam(@Param("parametro") String par);
	
	public Alunno findByName(String name);
}
