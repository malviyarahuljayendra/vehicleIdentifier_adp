package com.workscape.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "wheel")
@XmlAccessorType(XmlAccessType.FIELD) 
public class Powertrain {
	@XmlElement(name="human") 
	private String human;
	@XmlElement(name="internalCombustion") 
	private String internalCombustion;
	
	@XmlElement(name="bernoulli") 
	private String bernoulli;
	
	public String getHuman() {
		return human;
	}
	public void setHuman(String human) {
		this.human = human;
	}
	public String getInternalCombustion() {
		return internalCombustion;
	}
	public void setInternalCombustion(String internalCombustion) {
		this.internalCombustion = internalCombustion;
	}
	public String getBernoulli() {
		return bernoulli;
	}
	public void setBernoulli(String bernoulli) {
		this.bernoulli = bernoulli;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bernoulli == null) ? 0 : bernoulli.hashCode());
		result = prime * result + ((human == null) ? 0 : human.hashCode());
		result = prime * result + ((internalCombustion == null) ? 0 : internalCombustion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Powertrain other = (Powertrain) obj;
		if (bernoulli == null) {
			if (other.bernoulli != null)
				return false;
		} else if (!bernoulli.equals(other.bernoulli))
			return false;
		if (human == null) {
			if (other.human != null)
				return false;
		} else if (!human.equals(other.human))
			return false;
		if (internalCombustion == null) {
			if (other.internalCombustion != null)
				return false;
		} else if (!internalCombustion.equals(other.internalCombustion))
			return false;
		return true;
	}
	
}
