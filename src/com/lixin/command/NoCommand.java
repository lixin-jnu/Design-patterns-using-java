package com.lixin.command;

/*
 * 1.没有任何命令,即空执行:用于初始化每个按钮,当调用空命令时,对象什么都不做;
 * 2.其实,这也是一种设计模式,可以省略掉对空的判断;
 */

public class NoCommand implements Command {

	@Override
	public void execute() { }

	@Override
	public void undo() { }

}