package com.lixin.command;

public class TVOnCommand implements Command {

	//�ۺ�TVReceiver
	TVReceiver tv;

	//������
	public TVOnCommand(TVReceiver tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		//���ý����ߵķ���
		tv.on();
	}

	@Override
	public void undo() {
		//���ý����ߵķ���
		tv.off();
	}

}