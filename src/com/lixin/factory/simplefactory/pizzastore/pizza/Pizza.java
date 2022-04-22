package com.lixin.factory.simplefactory.pizzastore.pizza;

//��Pizza�����ɳ�����
public abstract class Pizza {

	protected String name;//Pizza����

	//׼��ԭ����,��ͬ��������һ��,���,�������ɳ��󷽷�
	public abstract void prepare();

	//����
	public void bake() {
		System.out.println(name + " baking!");
	}

	//�и�
	public void cut() {
		System.out.println(name + " cutting!");
	}

	//���
	public void box() {
		System.out.println(name + " boxing!");
	}

	public void setName(String name) {
		this.name = name;
	}

}
