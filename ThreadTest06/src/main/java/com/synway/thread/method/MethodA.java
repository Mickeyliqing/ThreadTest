package com.synway.thread.method;

import java.util.ArrayList;
import java.util.List;

public class MethodA {

	@SuppressWarnings("rawtypes")
	private List list = new ArrayList();
	@SuppressWarnings("unchecked")
	public void add() {
		list.add("anything");
	}
	public int size() {
		return list.size();
	}
}
