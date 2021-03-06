package com.amh.springmvc.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amh.springmvc.sample.models.Customer;
import com.amh.springmvc.sample.services.CustomerService;

@Controller
public class CustomerController {
	
private CustomerService customerService;
	
	@Autowired(required=true)
	@Qualifier(value="customerService")
	public void setPersonService(CustomerService customerService){
		this.customerService = customerService;
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("customers", this.customerService.getAll());
		return "customerList";
	}
	
	@RequestMapping(value = "/customers/add", method = RequestMethod.GET)
	public String showCustomerForm(Model model) {
		return "addCustomer";
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public String addCustomer(@Validated @ModelAttribute("customerForm") Customer customer, BindingResult result, Model model) {
		customerService.add(customer);
		return "redirect:customers";
	}

}
