package com.workscape.builder;

import com.workscape.model.Powertrain;

public class PowerTrainBuilder {

	private String human;
	private String internalCombustion;
	private String bernoulli;
	
	public PowerTrainBuilder withHuman(String human){
		this.human = human;
		return this;
	}
	
	public PowerTrainBuilder withInternalCombustion(String internalCombustion){
		this.internalCombustion = internalCombustion;
		return this;
	}
	
	public PowerTrainBuilder withBernoulli(String bernoulli){
		this.bernoulli = bernoulli;
		return this;
	}
	
	public Powertrain build(){
		Powertrain powertrain = new Powertrain();
		powertrain.setHuman(human);
		powertrain.setBernoulli(bernoulli);
		powertrain.setInternalCombustion(internalCombustion);
		return powertrain;
	}
	
}
