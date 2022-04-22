package com.lixin.iterator;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		List<College> collegeList = new ArrayList<>();
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		collegeList.add(computerCollege);
		collegeList.add(infoCollege);
		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}

}