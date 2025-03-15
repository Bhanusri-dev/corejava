package com.variables;

public class ListIteams {
	private int key;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	private String value;
	public ListIteams(Integer id, String name)
    {
        this.key = id;
        this.value = name;
    }
	

}
