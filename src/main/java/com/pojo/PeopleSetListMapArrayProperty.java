package com.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PeopleSetListMapArrayProperty {
	private int id;
	private String name;
	private int age;
	private Set<String> sets;
	private List<String> list;
	private List<String> list1;
	private String[] strs;
	private Map<String, String> map;
	private Properties prop;
	private Desk desk;

	/**
	 * @return the prop
	 */
	public Properties getProp() {
		return prop;
	}

	/**
	 * @param prop the prop to set
	 */
	public void setProp(Properties prop) {
		this.prop = prop;
	}

	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}

	/**
	 * @return the desk
	 */
	public Desk getDesk() {
		return desk;
	}

	/**
	 * @param desk the desk to set
	 */
	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	/**
	 * @return the strs
	 */
	public String[] getStrs() {
		return strs;
	}

	/**
	 * @param strs the strs to set
	 */
	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	/**
	 * @return the list1
	 */
	public List<String> getList1() {
		return list1;
	}

	/**
	 * @param list1 the list1 to set
	 */
	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	/**
	 * @return the list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	public PeopleSetListMapArrayProperty(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public PeopleSetListMapArrayProperty() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the sets
	 */
	public Set<String> getSets() {
		return sets;
	}

	/**
	 * @param sets the sets to set
	 */
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PeopleSetListMapArray [id=" + id + ", name=" + name + ", age=" + age + ", sets=" + sets + ", list="
				+ list + ", list1=" + list1 + ", strs=" + strs + ", map=" + map + ", prop=" + prop + ", desk=" + desk
				+ "]";
	}

}
