package j.k.kim.mapper;

import j.k.kim.example.Menu;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface MenuMapper {
	String insertSQL =
			"INSERT INTO MENU(OBJECT_ID, OBJECT_NM, PARENT_ID, OPEN_YN, SQ, FILE_PATH, NOTE) " + 
			"values(#{OBJECT_ID}, #{OBJECT_NM}, #{PARENT_ID}, #{OPEN_YN}, #{SQ}, #{FILE_PATH}, #{NOTE})";
	
	@Select("SELECT * FROM MENU WHERE object_id = #{object_id}")
	Menu getMenu(@Param("object_id") String object_id);
	
	@Select("SELECT * FROM MENU WHERE object_id = #{OBJECT_ID}")
	Menu getMenuFromVO(Menu menu);
	
	@Select("SELECT * FROM MENU")
	List<Menu> getMenuList();
	
	@Insert(insertSQL)
	int insertMenu(Menu menu);
}
