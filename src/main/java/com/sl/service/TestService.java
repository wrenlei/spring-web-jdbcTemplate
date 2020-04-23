package com.sl.service;

import java.util.List;
import java.util.Map;

public interface TestService {
	public void save() throws Exception;
	public void del();
	public void test();
	public List<Map<String, Object>> get();
	public void update();
	public void methodA();
	public void methodB();
}
