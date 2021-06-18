package com.leen.qouts.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leen.qouts.models.user;

@Transactional
@Repository
public interface userDao extends JpaRepository<user,Integer>  {

}
