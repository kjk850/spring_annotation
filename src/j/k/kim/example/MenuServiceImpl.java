package j.k.kim.example;

import j.k.kim.mapper.MenuMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl {
	
	@Autowired
	public MenuMapper menuMapper;
	
	public Menu getMenu(String object_id) {
		return menuMapper.getMenu(object_id);
	}
	
	public Menu getMenuFromVO(Menu menu) {
		return menuMapper.getMenuFromVO(menu);
	}
	
	public List<Menu> getMenuList() {
		return menuMapper.getMenuList();
	}
	
	public int insertMenu(Menu menu) {
		return menuMapper.insertMenu(menu);
	}
}
