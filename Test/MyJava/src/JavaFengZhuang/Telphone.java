package JavaFengZhuang;

/**
 * 
 * @author Administrator
 * ���Է�װ
 * ����ֱ���޸����Ե�ֵ
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
		System.out.println("Package��JavaFengZhuang���޲εĹ��췽��ִ��");
	}
	
	public Telphone(float newScreen, float newCpu, float newMen)
	{
		screen = newScreen;
		cpu = newCpu;
		men = newMen;
		System.out.println("�вεĹ��췽��");
	}
}
