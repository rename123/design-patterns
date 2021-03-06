package adapter.ducks;
import java.util.Random;

/**
 * @author: 小懒编程日记
 * @date: 2021-07-02
 * @description: 鸭子接口适配器
 */
public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}

	public void gobble() {
		duck.quack();
	}

	public void fly() {
		if (rand.nextInt(5)  == 0) {
		     duck.fly();
		}
	}
}
