package plasencia.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if( "pt75549373".equals(username)) {
			return new User("pt75549373", new BCryptPasswordEncoder().encode("idat2022"), new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Usuario o Contraseña no existe " + username);
		}
	}

}
