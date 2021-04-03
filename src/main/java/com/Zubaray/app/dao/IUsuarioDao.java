package com.Zubaray.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.Zubaray.app.models.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
