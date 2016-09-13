package com.bobby.redis;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.bobby.redis.imp.IRedisService;
@Service
public class RedisService implements IRedisService{
	private static final String ENCODING = "UTF-8"; 
	@Autowired
	private RedisTemplate<String,String> redisTemplate;
	public void save(final String key, final String value) {
		 try {  
	            redisTemplate.execute(new RedisCallback<String>() {  
	                public String doInRedis(RedisConnection connection) throws DataAccessException {  
	                    connection.set(key.getBytes(), value.getBytes());  
	                    return null;  
	                }  
	            });  
	        } catch(Exception e) {  
	            e.printStackTrace();  
	        }
	}

	public void remove(String key) {
		// TODO Auto-generated method stub
		
	}

	public Object get(final String key) {
		try {  
            String value = redisTemplate.execute(new RedisCallback<String>() {  
                public String doInRedis(RedisConnection connection) throws DataAccessException {  
                    byte[] b = connection.get(key.getBytes());  
                    try {  
                        return new String(b, ENCODING);  
                    } catch (UnsupportedEncodingException e) {  
                        e.printStackTrace();  
                    }  
                    return null;  
                }  
            });  
            return value;  
        } catch(Exception e) {  
            e.printStackTrace();  
        }  
        return null;  
	}

}
