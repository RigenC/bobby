package com.bobby.redis.imp;

public interface IRedisService {
	public void save(String key,String vale);
	public void remove(String key);
	public Object get(String key);
}
