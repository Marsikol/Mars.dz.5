public class Hero {
    public int health;
    public String superpower;
    public double demage;

    DopAtack heroDopAtack;

    public Hero(int health, double demage,String superpower ){
        this.health = health;
        this.superpower = superpower;
        this.demage = demage;
    }
    public Hero(int health,String superpower,int demage ){
        this.health = health;
        this.superpower = superpower;
        this.demage = demage;
    }


}
