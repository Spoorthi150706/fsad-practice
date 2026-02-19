package com.klu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
@Id
private int id;
private String name;
private String course;
public Student()
{}
public Student(int id,String name,String course)
{
	this.id=id;
	this.name=name;
	this.course=course;
}
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public String getCourse()
{
	return course;
}
public void setCourse(String course)
{
	this.course=course;
}
}
