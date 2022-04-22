package com.lixin.command;

public class LightOnCommand implements Command {

	//�ۺ�LightReceiver
	LightReceiver light;
	
	//������
	public LightOnCommand(LightReceiver light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		//���ý����ߵķ���
		light.on();
	}

	@Override
	public void undo() {
		//���ý����ߵķ���
		light.off();
	}

}