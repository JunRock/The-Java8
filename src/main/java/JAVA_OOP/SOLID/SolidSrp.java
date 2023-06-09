package JAVA_OOP.SOLID;
public class SolidSrp {
    public static void main(String[] args) {
    }
}

//SRP(단일 책임 원칙)
/*
 class DogZooKeeper{
    public void 사료주기(){};
}
class TigerZooKeeper{
    public void 고기주기(){};
}
class BearZooKeeper{
    public void 생선주기(){};
}
class Dog extends DogZooKeeper{
    @Override
    public void 사료주기() {
        super.사료주기();
    }
}
class Tiger extends TigerZooKeeper{
    @Override
    public void 고기주기() {
        super.고기주기();
    }
}
class Bear extends BearZooKeeper{
    @Override
    public void 생선주기() {
        super.생선주기();
    }
}
*/
/*
하나의 속성이 여러가지 의미를 갖는 경우(SRP)
 */
/*
abstract class Animal{
    abstract void 먹다();
}
class SeaAnimal extends Animal{
    @Override
    void 먹다() {
        //생선을 먹는다.
    }
}

class Carnivore extends Animal{
    @Override
    void 먹다() {
        //육고기를 먹는다
    }
}
*/

/*
LSP(리스코프 치환 원칙)
 */
class Person{}
class Boy extends Person{}
class Girl extends Person{}
class Husband extends Boy{}
class GrandFather extends Boy{}
class Wife extends Girl{}
class GrandMother extends Girl{}

/*
ISP(인터페이스 분리 원칙)
*/
/*
class ZooKeeper{
    public void 먹다(){};
    public void 자다(){};
    int name;
}

interface DogZooKeeper extends ZooKeeper{
    public static void 사료주기(){};
}
interface TigerZooKeeper{
    public static void 고기주기(){};
}
interface BearZooKeeper{
    public static void 생선주기(){};
}
*/
