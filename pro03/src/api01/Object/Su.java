package api01.Object;

/**
 * @Author : 김경은
 * @Date : 2020. 5. 11.
 * @Description :	우클릭-source-getter/setter 와 toString()
 * 					dto와 vo에서 많이 씀
 */
public class Su {
	private int x;
	private int y;
	private int z;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {	//데이터값 안들어온게 뭔지 확인할 수 있음. 찍어서 확인해 보는 방법
		return "Su [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	//dto, vo라고도 함
	//data transaction object, value object
	
}
