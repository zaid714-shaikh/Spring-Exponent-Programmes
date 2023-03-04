package com.ServiceIMPL;

import com.Service.DatabaseConnection;

public class Mysql implements DatabaseConnection {

	@Override
	public void conON() {
		// TODO Auto-generated method stub
		System.out.println("Mysql Database on");

	}

	@Override
	public void conOFF() {
		// TODO Auto-generated method stub
		System.out.println("Mysql Database off");
	}

}
