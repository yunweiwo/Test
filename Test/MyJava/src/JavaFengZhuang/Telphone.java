package JavaFengZhuang;

/**
 * 
 * @author Administrator
 * 属性封装
 * 避免直接修改属性的值
 */
public class Telphone 
{
	private float screen;
	private float cpu;
	private float men;
	
	public float getScreen()
	{
		return screen;
	}
	
	public void setScreen(float newScreen)
	{
		this.screen = newScreen;
	}
	
	public Telphone()
	{
		System.out.println("Package：JavaFengZhuang的无参的构造方法执行");
	}
	
	public Telphone(float newScreen, float newCpu, float newMen)
	{
		screen = newScreen;
		cpu = newCpu;
		men = newMen;
		System.out.println("有参的构造方法");
	}
}
