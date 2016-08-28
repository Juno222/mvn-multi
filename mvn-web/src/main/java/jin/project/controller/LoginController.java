package jin.project.controller;

import jin.project.pojo.Admin;
import jin.project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * \*
 * \* User: jin82
 * \* Date: 2016/08/28
 * \* Time: 2:29
 * \* Description:
 * \
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/show/{id}")
	@ResponseBody
	public Admin show(@PathVariable("id") Integer id){
		Admin admin = loginService.getById(id);
		return admin;
	}
}
