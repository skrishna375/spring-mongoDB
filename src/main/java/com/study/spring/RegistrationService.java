package com.study.spring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
	
	@Autowired
	public UsrRepository usrRepository;
	
	public String regUser(User usr) throws Exception{
		validateUser(usr);
		/*UsrEntity ue = usrRepository.findOne(usr.getUsrId());
		if(ue != null){
			throw new UserExists("");
		}*/
		
		/*UsrEntity usrEntity = new UsrEntity();
		usrEntity.setCity(usr.getCity());
		usrEntity.setEmail(usr.getEmail());
		usrEntity.setName(usr.getName());
		usrEntity.setPassword(usr.getPassword());
		usrEntity.setPhone(usr.getPhone());
		usrEntity.setUserid(usr.getUsrId());*/
		
		usrRepository.save(usr);
		return "UsrRepo.REGISTRATION_SUCCESS";
		
	}
		private void validateUser(User usr) throws Exception{
			// TODO Auto-generated method stub
			
			if(!isValidUsrID(usr.getUsrId()))
				throw new InvalidUsrID("RegistrationService.INVALID_USER_ID");
			if(!isValidPwd(usr.getPassword()))
				throw new InvalidPassword("RegistrationService.INVALID_PASSWORD");
			if(!isValidName(usr.getName()))
				throw new InvalidName("RegistrationService.INVALID_NAME");
			if(!isValidCity(usr.getCity()))
				throw new Invalidcity("RegistrationService.INVALID_CITY");
			if(!isValidPhone(usr.getPhone()))
				throw new InvalidPhone("RegistrationService.INVALID_PHONE");
			if(!isValidEmail(usr.getEmail()))
				throw new InvalidEmail("RegistrationService.INVALID_EMAIL");
		}

		private boolean isValidEmail(String email) {
			// TODO Auto-generated method stub
			Boolean b1 = false;
			String reg6 = "^[a-zA-Z0-9+_.-]+@(.+)$";
			
			Pattern p6 = Pattern.compile(reg6);
			Matcher m6 = p6.matcher(email);
			
			if(m6.matches())
				b1=true;
			return b1;	
		}

		private boolean isValidPhone(String phone) {
			// TODO Auto-generated method stub
			Boolean b1 = false;
			String reg5 = "[0-9]{10}";
			
			Pattern p5 = Pattern.compile(reg5);
			Matcher m5 = p5.matcher(phone);
			
			if(m5.matches())
				b1=true;
			return b1;	
		}

		private boolean isValidCity(String city) {
			// TODO Auto-generated method stub
			Boolean b1 = false;
			String reg4 = "^[a-zA-Z0-9]{4,15}+$";
			
			Pattern p4 = Pattern.compile(reg4);
			Matcher m4 = p4.matcher(city);
			
			if(m4.matches())
				b1=true;
			return b1;	
		}

		private boolean isValidName(String name) {
			// TODO Auto-generated method stub
			Boolean b1 = false;
			String reg3 = "^[a-zA-Z0-9]{4,15}+$";
			
			Pattern p3 = Pattern.compile(reg3);
			Matcher m3 = p3.matcher(name);
			
			if(m3.matches())
				b1=true;
			return b1;	
		}

		private boolean isValidPwd(String password) {
			// TODO Auto-generated method stub
			Boolean b1 = false;
			String reg2 = "^[a-zA-Z0-9]{8,15}+$";
			
			Pattern p2 = Pattern.compile(reg2);
			Matcher m2 = p2.matcher(password);
			
			if(m2.matches())
				b1=true;
			return b1;	
		}

		public Boolean isValidUsrID(String usrID) {
			// TODO Auto-generated method stub
			Boolean b1 = false;
			String reg = "^[a-zA-Z0-9]{4,15}+$";
			
			Pattern p1 = Pattern.compile(reg);
			Matcher m1 = p1.matcher(usrID);
			
			if(m1.matches())
				b1=true;
			return b1;		
		}

	}
