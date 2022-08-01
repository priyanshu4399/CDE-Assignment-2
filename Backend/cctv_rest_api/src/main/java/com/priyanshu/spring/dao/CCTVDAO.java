package com.priyanshu.spring.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanshu.spring.bo.CCTVBO;
import com.priyanshu.spring.entities.CCTV;
import com.priyanshu.spring.repos.CCTVRepository;

@Service
public class CCTVDAO {
	
	@Autowired
	CCTVRepository repo;
	
	public List<CCTVBO>findAllCCTV() {
		
		List<CCTVBO> cctvBOList = new ArrayList<>();
		
		List<CCTV> cctvs = (List<CCTV>) repo.findAll();
		for(CCTV cctv : cctvs) {
			CCTVBO cctvbo = new CCTVBO();
			cctvbo.setDescription(cctv.getDescription());
			cctvbo.setImg_url(cctv.getImg_url());
			cctvbo.setPrice(cctv.getPrice());
			cctvBOList.add(cctvbo);
		}
		return cctvBOList;
		
	}

	public CCTVBO findById(Long id) {
		CCTVBO cctvbo = new CCTVBO();
		Optional<CCTV> cctv = repo.findById(id);
		if(cctv.isPresent()) {
			cctvbo.setImg_url(cctv.get().getImg_url());
			cctvbo.setDescription(cctv.get().getDescription());
			cctvbo.setPrice(cctv.get().getPrice());
			return cctvbo;
		}
		else
			return null;
		
		
	}

	public List<CCTVBO> findAllCCTVDetails() {
		List<CCTVBO> cctvBOList = new ArrayList<>();
		
		List<CCTV> cctvs = (List<CCTV>) repo.findAll();
		for(CCTV cctv : cctvs) {
			CCTVBO cctvbo = new CCTVBO();
			cctvbo.setDescription(cctv.getDescription());
			cctvbo.setImg_url(cctv.getImg_url());
			cctvbo.setPrice(cctv.getPrice());
			cctvbo.setBrand(cctv.getBrand());
			cctvbo.setResolution(cctv.getResolution());
			cctvbo.setShape(cctv.getShape());
			cctvbo.setStyle(cctv.getStyle());
			cctvbo.setTechnology(cctv.getTechnology());
			cctvbo.setRange(cctv.getRange());
			cctvBOList.add(cctvbo);
		}
		return cctvBOList;
	}

	public CCTVBO findAllCCTVDetailById(Long id) {
		CCTVBO cctvbo = new CCTVBO();
		Optional<CCTV> cctvOP = repo.findById(id);
		CCTV cctv = cctvOP.get();
		if(cctvOP.isPresent()) {
			cctvbo.setDescription(cctv.getDescription());
			cctvbo.setImg_url(cctv.getImg_url());
			cctvbo.setPrice(cctv.getPrice());
			cctvbo.setBrand(cctv.getBrand());
			cctvbo.setResolution(cctv.getResolution());
			cctvbo.setShape(cctv.getShape());
			cctvbo.setStyle(cctv.getStyle());
			cctvbo.setTechnology(cctv.getTechnology());
			cctvbo.setRange(cctv.getRange());
			return cctvbo;
		}
		else
			return null;
	}
	
}
