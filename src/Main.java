public class Main {
    public static void main(String[] args) {




        Hero  myHero = new Hero(370, 35,"быстрое мышление" );
        System.out.println("Hero: " + "health: " + myHero.health + " demage: " + myHero.demage + ": супер способнспособность: " + myHero.superpower);

        Hero c1 = new Hero(370,30,"быстрое мышление");
        System.out.println("Hero: " + "health: " + c1.health + " demage: " + c1.demage + ": супер способнспособность: " + c1.superpower);

        DopAtack ataksHero = new DopAtack("60",50 );


    Boss d1 = new Boss(1860,70, "не полполучает урон от огня");
      System.out.println("Boss: " + "health: " + d1.health + " demage: " + d1.demage + ":  защита: " + d1.protection);

        Boss k1 = new Boss(1800,75, "не полполучает урон от огня");
        System.out.println("Boss: " + "health: " + k1.health + " demage: " + k1.demage + ":  защита: " + k1.protection);

    }

}
