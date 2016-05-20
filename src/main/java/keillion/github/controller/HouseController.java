package keillion.github.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import keillion.github.pojo.House;
import keillion.github.service.IHouseService;

@Controller
@RequestMapping("/house")
public class HouseController {
	@Resource
	private IHouseService houseService;
	
	@RequestMapping("/showHouse")
	public String toIndex(HttpServletRequest request,Model model){
		try{
			//有合法id
			int houseId = Integer.parseInt(request.getParameter("id"));
			House house = this.houseService.getById(houseId);
			if(house==null){
				model.addAttribute("bug", "house is null");
			}
			model.addAttribute("house", house);
			model.addAttribute("phone", house.getPhone());
			request.setAttribute("what", "why");
		}
		catch(Exception e){
			//没合法id
			model.addAttribute("ebug", "id is bug<br>"+e.getMessage());
		}
		model.addAttribute("mymessage", "the page is worked");
		return "showHouse";
	}
	
	@RequestMapping("/getTxt")
	@ResponseBody
	public String getTxt(HttpServletRequest request,HttpServletResponse response){
		int[] a={1,2,3};
		return JSON.toJSONString(a);
	}
	
	@RequestMapping("/getHouseNameFromPara")
	@ResponseBody
	public Object getHouseNameFromPara(HttpServletRequest request,HttpServletResponse response){
		List<House> hs = houseService.getByExample(null, null, null, null, null, "zhangsan");
		return hs;
	}
}
