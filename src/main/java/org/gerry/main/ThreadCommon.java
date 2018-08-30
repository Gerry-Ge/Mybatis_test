package org.gerry.main;

import java.util.Date;

import org.gerry.mappers.UserMapper;

public class ThreadCommon extends Thread {
	private UserMapper um;

	public ThreadCommon(UserMapper ump) {
		this.um = ump;
	}

	public void run() {
		while (true) {
			try {
				um.selectAllUser();
				System.out.println(Thread.currentThread().getName() + "--"
						+ CodeUtils.parseDate(new Date()));
				Thread.sleep(60*60);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

