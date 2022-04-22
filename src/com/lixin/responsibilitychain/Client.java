package com.lixin.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		//��������
		PurchaseRequest purchaseRequest = new PurchaseRequest(25000, 1);
		PurchaseRequest purchaseRequest2 = new PurchaseRequest(3000, 2);
		PurchaseRequest purchaseRequest3 = new PurchaseRequest(50000, 3);
		//������ص�������
		DepartmentApprover departmentApprover = new DepartmentApprover("������");
		CollegeApprover collegeApprover = new CollegeApprover("��Ժ��");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("����У��");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("١У��");
		//��Ҫ�����������������һ�����������ú�(�����˹��ɻ���)
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		//��������
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
		departmentApprover.processRequest(purchaseRequest2);
		departmentApprover.processRequest(purchaseRequest3);
		collegeApprover.processRequest(purchaseRequest2);
	}

}