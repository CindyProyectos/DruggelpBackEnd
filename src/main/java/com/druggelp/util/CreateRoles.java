//package com.druggelp.util;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;

//import com.druggelp.security.entity.Rol;
//import com.druggelp.security.enums.RolNombre;
//import com.druggelp.security.service.RolService;

//@Component
//public class CreateRoles implements CommandLineRunner{

//	@Autowired
//	RolService rolService;
	
//	@Override
//	public void run(String... args) throws Exception {
//		Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
//		Rol rolUser = new Rol(RolNombre.ROLE_USER);
//		rolService.save(rolAdmin);
//		rolService.save(rolUser);
//	}

//}
