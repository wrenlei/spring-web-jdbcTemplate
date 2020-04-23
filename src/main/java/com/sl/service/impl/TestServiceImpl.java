package com.sl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sl.dao.TestDao;
import com.sl.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;
	

	public void test(){
        save();
    }

    @Transactional
    public void save () {
        try {
            testDao.save();
            throw new RuntimeException();
        } catch (Exception e) {
        }
    }
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void methodA() {
     //methodB();
     testDao.methodA();
    }

    @Transactional(propagation = Propagation.NEVER)
    public void methodB() {
    	testDao.methodB();
    }

	@Override
	@Transactional(propagation=Propagation.NEVER)
	public void del() {
		// TODO Auto-generated method stub
		testDao.del();
	}

	@Override
	public List<Map<String, Object>> get() {
		// TODO Auto-generated method stub
		return testDao.get();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update() {
		// TODO Auto-generated method stub
		testDao.update();
	}

}
