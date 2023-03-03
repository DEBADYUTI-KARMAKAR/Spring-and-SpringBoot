package com.gameproject.FirstGame.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService {

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
