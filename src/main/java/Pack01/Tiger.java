package Pack01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController
@Controller
public class Tiger {
	@RequestMapping("/t1")
	public String func01() {
		System.out.println("function call");
//		return "apple";
		return "TigerView";
	}
}
