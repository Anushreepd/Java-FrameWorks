package program8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class clsMin {

	@RequestMapping("/")
	public String display()
	{
		return "display";
	}
	
	@RequestMapping("/page")
	public String page(@RequestParam String id,@RequestParam String name, Model model)
	{
		System.out.println("id" +id);
		System.out.println("name"+name);
		model.addAttribute("id" , id);
		model.addAttribute("name",name);
		return "page";
}
}