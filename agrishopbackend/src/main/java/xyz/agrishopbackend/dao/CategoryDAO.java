package xyz.agrishopbackend.dao;

import java.util.List;

import xyz.agrishopbackend.dto.CategoryDTO;

public interface CategoryDAO {

	List<CategoryDTO> list();
	 CategoryDTO get(int id);
}
