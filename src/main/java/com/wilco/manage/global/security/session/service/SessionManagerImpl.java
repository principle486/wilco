package com.wilco.manage.global.security.session.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.member.MemberBean;
import com.wilco.manage.global.beans.security.SessionBean;

@Service("sessionManager")
public class SessionManagerImpl implements SessionManager {
	
	private static AuthenticationManager am = new SampleAuthenticationManager();

	public SessionBean getAuthentication(MemberBean memberBean) {
		
		  SessionBean session = new SessionBean();
		
		  System.out.println("Please enter your username:" + memberBean.getMemId());
		  String name = memberBean.getMemId();
		  System.out.println("Please enter your password:" + memberBean.getMemPwd());
		  String password = memberBean.getMemPwd();
		  try {
			Authentication request = new UsernamePasswordAuthenticationToken(name, password);
			Authentication result = am.authenticate(request);
			SecurityContextHolder.getContext().setAuthentication(result);
			
		  } catch(AuthenticationException e) {
			System.out.println("Authentication failed: " + e.getMessage());
		  }
		
		/*.out.println("Successfully authenticated. Security context contains: " +
				  SecurityContextHolder.getContext().getAuthentication());*/

		  Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
		
		  session.setIsAuth(authentication.isAuthenticated());
		  
		return session;
	}
}
	

	class SampleAuthenticationManager implements AuthenticationManager {
	
		static final List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();
	
		static {
			AUTHORITIES.add(new SimpleGrantedAuthority("ROLE_USER"));
		}
	
		public Authentication authenticate(Authentication auth) throws AuthenticationException {
			
			//if (auth.getName().equals(auth.getCredentials())) {
			//}
			//throw new BadCredentialsException("Bad Credentials");
			try{
				return new UsernamePasswordAuthenticationToken(auth.getName(),
						auth.getCredentials(), AUTHORITIES);
			}catch(BadCredentialsException e){
				return (Authentication) new BadCredentialsException("Bad Credentials");
			}
		}
	}