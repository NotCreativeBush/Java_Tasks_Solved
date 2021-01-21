package Task25;

public class Car {
    protected int fuelInTank=35;
    protected int kilometersTravelled=0;
    public void fill(){
        if(Math.random()<0.1){
            throw new Explosion();
        }
        fuelInTank+=15+Math.round(Math.random()*20);
        System.out.println("Current fuel level: "+fuelInTank);
    }
    public void drive100km() throws NotEnoughGas{
        if(fuelInTank<10){
            throw new NotEnoughGas("Only "+fuelInTank+" liters. Must fill the tank.");
        }
        fuelInTank-=10;
        kilometersTravelled+=100;
        System.out.println("Kilometers travelled: "+kilometersTravelled+", current fuel level: "+fuelInTank);
    }
}
