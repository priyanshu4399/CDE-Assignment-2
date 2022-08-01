package com.priyanshu.spring.bo;

public class CCTVBO {
	private String img_url;
	private String description;
	private Double price;
	private String brand;
	private String style;
	private String shape;
	private String resolution;
	private String technology;
	private String range;
	
	public CCTVBO(){
		
	}
	
	public CCTVBO(String img_url, String description, Double price, String brand, String style, String shape,
			String resolution, String technology,String range) {
		super();
		this.img_url = img_url;
		this.description = description;
		this.price = price;
		this.brand = brand;
		this.style = style;
		this.shape = shape;
		this.resolution = resolution;
		this.technology = technology;
		this.range= range;
	}



	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}
	
	
	
}
