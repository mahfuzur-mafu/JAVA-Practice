package com.mahfuz.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahfuz.main.model.Programmer;
@Repository
public interface ProgrammerRepo extends JpaRepository<Programmer,Integer>{

	List<Programmer> findByplang(String plang);

}
