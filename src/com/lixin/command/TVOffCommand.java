package com.lixin.command;

public class TVOffCommand implements Command {

	//�ۺ�TVReceiver
	TVReceiver tv;

	//������
	public TVOffCommand(TVReceiver tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		//���ý����ߵķ���
		tv.off();
	}

	@Override
	public void undo() {
		//���ý����ߵķ���
		tv.on();
	}

}