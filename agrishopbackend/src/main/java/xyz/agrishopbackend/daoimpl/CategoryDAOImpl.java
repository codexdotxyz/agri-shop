package xyz.agrishopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import xyz.agrishopbackend.dao.CategoryDAO;
import xyz.agrishopbackend.dto.CategoryDTO;

@Repository("categoryDAORepo")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<CategoryDTO> categories = new ArrayList<>();
	static {
		//1st item
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(1);
		categoryDTO.setName("Rice Bags");
		categoryDTO.setDescription("Usefull to get energy");
		categoryDTO.setImageURL("http://dreamstop.com/wp-content/uploads/2017/04/watching-tv.jpg");
		//categoryDTO.setActive(true);
		
		categories.add(categoryDTO);
		
		//2nd item
		categoryDTO = new CategoryDTO();
		categoryDTO.setId(2);
		categoryDTO.setName("Mangoes");
		categoryDTO.setDescription("Available only on Summers");
		categoryDTO.setImageURL("http://stz.india.com/sites/default/files/styles/zeebiz_850x478/public/2017/03/23/16461-xiaomi-redmi4a-sale.jpg?itok=-VxvZ9JH");
		//categoryDTO.setActive(false);
		
		categories.add(categoryDTO);
		
		//3rd item
		categoryDTO = new CategoryDTO();
		categoryDTO.setId(3);
		categoryDTO.setName("Motors");
		categoryDTO.setDescription("Usefull to pump water from ponds");
		categoryDTO.setImageURL("");
		categories.add(categoryDTO);

	}

	@Override
	public List<CategoryDTO> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public CategoryDTO get(int id) {
		// enchanced for loop
		for(CategoryDTO categoryDTO :categories)
		{
			if(categoryDTO.getId()== id)
				return categoryDTO;
		}
		return null;
	}

}
