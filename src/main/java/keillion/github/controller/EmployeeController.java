package keillion.github.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import keillion.github.service.IEmployeeService;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {
	@Resource
	private IEmployeeService employeeService;
	
	@RequestMapping("/searchEmployee")
	@ResponseBody
	public Object toIndex(HttpServletRequest request,Model model){
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String idcard = request.getParameter("idcard");
		String sex = request.getParameter("sex");
		String birthY = request.getParameter("birthY");
		String birthM = request.getParameter("birthM");
		String birthD = request.getParameter("birthD");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String qq = request.getParameter("qq");
		String wechat = request.getParameter("wechat");
		return employeeService.getByExample(id != null ? Integer.parseInt(id) : null,
				name, idcard, 
				sex != null ? Integer.parseInt(sex) : null,
				birthY != null ? Integer.parseInt(birthY) : null, 
				birthM != null ? Integer.parseInt(birthM) : null,
				birthD != null ? Integer.parseInt(birthD) : null,
				email, phone, qq, wechat);
	}
	
}
