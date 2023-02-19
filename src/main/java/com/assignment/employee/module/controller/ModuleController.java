package com.assignment.employee.module.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.employee.module.repository.ModuleRepository;

@RestController
@RequestMapping("/module")
public class ModuleController {

	@Autowired
	ModuleRepository moduleRepository;
	
	@ResponseBody
	@RequestMapping("/modules")
	public List<Module> getModules()
	{	
		return moduleRepository.findAll();	
	}
}
