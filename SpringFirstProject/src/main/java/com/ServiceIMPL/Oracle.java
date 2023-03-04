package com.ServiceIMPL;

import com.Service.DatabaseConnection;

public class Oracle implements DatabaseConnection {

	@Override
	public void conON() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Connection on");

	}

	@Override
	public void conOFF() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Connection off");

	}

}
