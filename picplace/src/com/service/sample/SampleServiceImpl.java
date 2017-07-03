package com.service.sample;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibatis.sqlmap.client.SqlMapClient;

@Service("sampleService")
public class SampleServiceImpl implements SampleService{

	@Autowired 
	private SqlMapClient sql;
	
	@SuppressWarnings("unchecked")
	public List<HashMap<String, Object>> selectReturnString()throws Exception{
		
		return (List<HashMap<String, Object>>)sql.queryForList("showtable");
	}
}
