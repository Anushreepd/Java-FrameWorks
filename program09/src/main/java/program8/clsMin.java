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
		int a = Integer.parseInt(id);
		if(a>100)
		{
			model.addAttribute("error1","bigg");
			return "display";
			
		}
		System.out.println("name"+name);
		if(name.length()>10)
		{
			model.addAttribute("error2","long name");
			return "display";
		}
		model.addAttribute("id" , id);
		model.addAttribute("name",name);
		return "page";
}
}