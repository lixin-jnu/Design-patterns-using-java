package com.lixin.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		//创建请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(25000, 1);
		PurchaseRequest purchaseRequest2 = new PurchaseRequest(3000, 2);
		PurchaseRequest purchaseRequest3 = new PurchaseRequest(50000, 3);
		//创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");
		//需要将各个审批级别的下一个审批人设置好(审批人构成环形)
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		//处理请求
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
		departmentApprover.processRequest(purchaseRequest2);
		departmentApprover.processRequest(purchaseRequest3);
		collegeApprover.processRequest(purchaseRequest2);
	}

}