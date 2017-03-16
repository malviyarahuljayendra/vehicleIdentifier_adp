package com.workscape.builder;

import com.workscape.model.Frame;

public class FrameBuilder {

	private String material;
	
	public FrameBuilder withMaterial(String material){
		this.material = material;
		return this;
	}
	
	public Frame build(){
		Frame frame = new Frame();
		frame.setMaterial(material);
		return frame;
	}
	
}
