package j.k.kim.example;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {

	@Autowired
	MenuServiceImpl menuServiceImpl;
	
	Logger logger = Logger.getLogger(MenuController.class);
	
	@RequestMapping("/testPage")
	public String testPage(Model model) {
		Menu menu = menuServiceImpl.getMenu("A");
		model.addAttribute("menu", menu);
		
		List<Menu> menuList = menuServiceImpl.getMenuList();
		model.addAttribute("menuList", menuList);

		Menu menuFromVO = menuServiceImpl.getMenuFromVO(menu);
		model.addAttribute("menuFromVO", menuFromVO);
		return "testPage";
	}
	
	@RequestMapping(value="/menuInsertPage", method=RequestMethod.GET)
	public String menuInsertPage() {
		return "menuInsertPage";
	}
	
	@RequestMapping(value="/menuInsertPage", method=RequestMethod.POST)
	public String menuInputPage(Menu menu, Model model) {
		logger.info(menu);
		int ret = menuServiceImpl.insertMenu(menu);
		model.addAttribute("resultStr", "메뉴 추가 " + ret + "건 정상적으로 되었습니다.");
		//return "redirect:/menuListPage";
		return "forward:/menuListPage";
	}
	
	@RequestMapping("/menuListPage")
	public String menuListPage(Model model) {
		List<Menu> menuList = menuServiceImpl.getMenuList();
		model.addAttribute("menuList", menuList);
		return "menuListPage";
	}
	
	@RequestMapping("/popPage")
	public String popPage() {
		return "popPage";
	}
}
