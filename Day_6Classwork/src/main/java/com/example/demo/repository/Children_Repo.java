package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Children_Entity;

public interface Children_Repo extends JpaRepository<Children_Entity, Integer>
{

}
