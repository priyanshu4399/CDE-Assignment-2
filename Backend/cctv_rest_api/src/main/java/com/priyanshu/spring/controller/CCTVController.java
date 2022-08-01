package com.priyanshu.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyanshu.spring.bo.CCTVBO;
import com.priyanshu.spring.dao.CCTVDAO;
import com.priyanshu.spring.entities.CCTV;

@RestController
//@CrossOrigin(origins="http://locahost:4200")
@RequestMapping("/cctv")
public class CCTVController {
	
	@Autowired
	CCTVDAO dao;
	
	@GetMapping
	public List<CCTVBO> getCCTVs(){
		return dao.findAllCCTV();
	}
	
	@GetMapping("/{id}")
	public CCTVBO update(@PathVariable("id") Long id){
		return dao.findById(id);
	}
	
	@GetMapping("/getDetails")
	public List<CCTVBO> getCCTVDetails(){
		return dao.findAllCCTVDetails();
	}
	
	@GetMapping("/getDetails/{id}")
	public CCTVBO getCCTVDetailById(@PathVariable("id") Long id){
		return dao.findAllCCTVDetailById(id);
	}
	
	
//	@PostMapping
//	public CCTV create(@RequestBody CCTV cctv){
//		return repo.save(cctv);
//	}
//	
//	@PutMapping
//	public CCTV update(@RequestBody CCTV cctv){
//		return repo.save(cctv);
//	}
//	
//	
//	@DeleteMapping("/{id}")
//	public void delete(@PathVariable("id") Long id){
//		repo.deleteById(id);
//	}
}
