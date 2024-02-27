package day02_06;

import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Member2Service {

	public static ArrayList<Member2> list = new ArrayList<>();
	
	//회원가입
	public static void 회원가입(Member2 member) {
		list.add(member);
	}
	
	//내 정보
	public static Member2 내정보(String username, String password) {
		for(Member2 e:list) {
			if(e.getUsername().equals(username) && e.getPassword().equals(password)) {
				return e;
			}
		}
		return null;
	}
	
	
	//아이디찾기
	public static String 아이디찾기(String email,String password) {
		for(Member2 e:list) {
			if(e.getEmail().equals(email) && e.getPassword().equals(password)) {
				return e.getUsername();
			}
		}
		return null;
	}
	
	//비번찾기
	public static String 비번찾기(String username) {
		for(Member2 e:list) {
			if(e.getUsername().equals(username)) {
				return RandomStringUtils.randomAlphanumeric(20);
			}
		}
		return null;
	}
	
	
	//로그인
	public static boolean 로그인(String username, String password) {
		for(Member2 e:list) {
			if(e.getUsername().equals(username) && e.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	//비번변경
	public static boolean 비번변경(String username, String pwd, String newpwd) {
		for(Member2 e:list) {
			if(e.getUsername().equals(username) && e.getPassword().equals(pwd)) {
				e.setPassword(newpwd);
				return true;
			}
		}
		return false;
	}
}
