@Controller
public class UserController {

	//로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login(){
		logger.info("경로 :login");

		return "user/login";

	}

	//회원추가 페이지로 이동
	@RequestMapping("/user/lnsert.do")
	public String lnsert(){
		logger.info("경로 :lnsert");

		return "user/lnsert";
	}

	//회원수정 페이지로 이동
	@RequestMapping("/user/update.do")
	public String update(){
		logger.info("경로 :update");

		return "user/update";
	}

}