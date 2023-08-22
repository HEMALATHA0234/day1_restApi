package com.skcet.Restapispring.controller1;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller1 {
@GetMapping("/welcome")
public String Welcome() {
	return "Welcome String boot";
}
@GetMapping("/get")
public String getName() {
	String stuname="Iamneo";
	return "Welcome"+stuname+"!";
}
@GetMapping("/color")
public String getmyfav() {
	String getFavcolor="blank";
	return "My Fav color is"+getFavcolor;
}
}
