/**
 * 
 */
package com.bankingApp.persistance.Security.domain;

/**
 * @author basanth
 *
 */
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.bankingApp.persistance.domain.User;

public class CustomUserDetails extends User implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Autowired
	private User user;

	public CustomUserDetails(final User users) {
		super(users);
		this.user = users;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return getRoles().stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRoleName()))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUserName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}