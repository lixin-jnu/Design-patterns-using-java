package com.lixin.command;

/*
 * 1.û���κ�����,����ִ��:���ڳ�ʼ��ÿ����ť,�����ÿ�����ʱ,����ʲô������;
 * 2.��ʵ,��Ҳ��һ�����ģʽ,����ʡ�Ե��Կյ��ж�;
 */

public class NoCommand implements Command {

	@Override
	public void execute() { }

	@Override
	public void undo() { }

}