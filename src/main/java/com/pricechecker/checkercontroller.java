package com.pricechecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pricechecker.model.UserInterface;
import com.pricechecker.model.product;

@Controller
public class checkercontroller {
	@Autowired
	private UserInterface userRepo;
	
	@RequestMapping("/")
		public String hello() {
			return "index";
		}
	
	@RequestMapping("/search")
	public String search(@RequestParam("searchItem") String category,Model model) {
		List<product> user =new ArrayList<>();
		String searchword = checker(category);
	
		try {
			System.out.println("type category is : "+searchword);
			user= userRepo.findBycategory(searchword);
			//System.out.print(user.toString());
			if(!searchword.equals("empty")) {
				model.addAttribute("nothing",null);
			model.addAttribute("user",user);
		
			
			}else {
				product pro=new product();
				pro.setProductName("nothing");
				pro.setCategory(category);
				user.add(pro);
				model.addAttribute("nothing","nothing");
		}
		
		}catch(Exception e) {
			
		}
		
		return "searchresult";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("/productinfopage")
	public String productinfo(@RequestParam("productid")int id,Model model) {
		product newproduct=new product();
		System.out.println("Product name : " +id);
		try {
			newproduct=userRepo.findByIdnum(id);
			System.out.println(newproduct.toString());
			model.addAttribute("product",newproduct);
			
			return "productinfo";
			
		}catch(Exception e) {
			System.out.println("Nothing found");
			return "index";
		}
		
		
	}
	
	@RequestMapping("/formsearch")
	public String mapping(@RequestParam("productName") String productName,
			@RequestParam("category") String category,
			@RequestParam("a_description") String a_description,
			@RequestParam("a_mrp") double a_mrp,
			@RequestParam("a_offerPrice") double a_offerPrice,
			@RequestParam("a_source") String a_source,
			@RequestParam("a_imgSource") String a_imgSource,
			@RequestParam("f_description") String f_description,
			@RequestParam("f_mrp") double f_mrp,
			@RequestParam("f_offerPrice") double f_offerPrice,
			@RequestParam("f_source") String f_source,
			@RequestParam("f_imgSource") String f_imgSource) {
		
		product newproduct=new product();
		newproduct.setProductName(productName);
		newproduct.setCategory(category);
		newproduct.setA_description(a_description);
		newproduct.setA_mrp(a_mrp);
		newproduct.setA_offerPrice(a_offerPrice);
		newproduct.setA_imgSource(a_imgSource);
		newproduct.setA_source(a_source);
		newproduct.setF_description(f_description);
		newproduct.setF_mrp(f_mrp);
		newproduct.setF_offerPrice(f_offerPrice);
		newproduct.setF_imgSource(f_imgSource);
		newproduct.setF_source(f_source);
		
		userRepo.save(newproduct);
		
	//	System.out.println(newproduct.toString());
		return "index";
		
	}
	public String checker(String category) {
		//Checking for Pendrive Possibles
		String searchword=null;
		if(category.equalsIgnoreCase("Pen Drive") ||category.equalsIgnoreCase("pendrive") || category.equalsIgnoreCase("PenDrives")) {
			searchword="pendrive";
		}//Checking for Washing Machine Possibles
		else if(category.equalsIgnoreCase("Washingmachine") ||category.equalsIgnoreCase("Washing Machines") || category.equalsIgnoreCase("Washingmachines") || category.equalsIgnoreCase("Washing machine")) {
			searchword="washingmachine";
		}//Checking for tv Possibles
		else if(category.equalsIgnoreCase("Television") ||category.equalsIgnoreCase("Televisions") || category.equalsIgnoreCase("tvs")|| category.equalsIgnoreCase("tv")) {
			searchword="tv";
		}//Checking for headset Possibles
		else if(category.equalsIgnoreCase("headsets") ||category.equalsIgnoreCase("head set") || category.equalsIgnoreCase("head sets")|| category.equalsIgnoreCase("headphones")|| category.equalsIgnoreCase("headphone")|| category.equalsIgnoreCase("headset")) {
			searchword="headset";
		}//Checking for Bluetooth speaker Possibles
		else if(category.equalsIgnoreCase("speaker") ||category.equalsIgnoreCase("speakers") || category.equalsIgnoreCase("bluetoothspeaker")
				|| category.equalsIgnoreCase("bluetooth speaker")|| category.equalsIgnoreCase("bluetoothspeaker")|| category.equalsIgnoreCase("bluetoothspeakers")) {
			searchword="speaker";
		}//Checking for Smart Phone Possibles
		else if(category.equalsIgnoreCase("mobilephone") ||category.equalsIgnoreCase("mobilephones") || category.equalsIgnoreCase("mobile phone")
				||category.equalsIgnoreCase("mobile phones") ||category.equalsIgnoreCase("smartphone") || category.equalsIgnoreCase("smartphones")
				||category.equalsIgnoreCase("mobile") ||category.equalsIgnoreCase("mobiles") || category.equalsIgnoreCase("phones")
				||category.equalsIgnoreCase("smart phone") || category.equalsIgnoreCase("smart phones")){
			searchword="smartphone";   
		}//Checking for Air conditioner Possibles
		else if(category.equalsIgnoreCase("Air conditioner") ||category.equalsIgnoreCase("Air conditioners") || category.equalsIgnoreCase("Airconditioner")
			  ||category.equalsIgnoreCase("Airconditioners") ||category.equalsIgnoreCase("ac") || category.equalsIgnoreCase("acs")) {
			searchword="ac";
		}//Checking for bag Possibles
		else if(category.equalsIgnoreCase("bag") ||category.equalsIgnoreCase("bags") ){
			searchword="bag";
		}else {
			searchword="empty";
		}
		return searchword;
		
	}
	

}
