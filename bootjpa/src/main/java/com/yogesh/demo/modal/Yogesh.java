package com.yogesh.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Yogesh {
	@Id
private int aid;
private String name;
private String tech;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Yogesh [aid=" + aid + ", name=" + name + "]";
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}

}
