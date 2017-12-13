package com.marck.spring.app.models.dao;

import java.util.List;
import com.marck.spring.app.models.entity.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();

}
