package com.codercocoon.spring.ioc.configuration.java;

/**
 * 
 * @author contact@codercocoon.com
 *
 */
public interface UserService {

	String getUserinformation(int userId);

	void lockAccountUser(int userId);

	void unlockAccountUser(int userId);
}