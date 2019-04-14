package soapfresh;

import javax.jws.WebService;

@WebService
public class web {
	public String welcome(String a) {
		return "heloo" + a;
	}
}
