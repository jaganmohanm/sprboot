package com.emp.springbootmysql;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
EmpDaoImpl ee;
EmpServiceInterface esi;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String hey(Model model)
	{
	model.addAttribute("msg","jagan");
		return "hey";
	}
	
	@RequestMapping(value={ "/hey"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hey");
        return modelAndView;
    }
	
	
	@RequestMapping(value="/emp")
	public String listEmp(Model model){
		model.addAttribute("employee", new EmpPojo());
		model.addAttribute("listEmpPojo", this.esi.listEmployees());
		return "EmpPojo";
	}
	
}
