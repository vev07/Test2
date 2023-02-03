public class ElectroCar {
    private int id;

    private class Motor{
        public void startMotor(){
            System.out.println("Motor "+id+" is starting");
        }
    }
    public static class Battery{
        public void batteryIsCharge(){
            System.out.println("Battery is charging ");
        }
    }
    public ElectroCar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("ElectroCar "+id+" is starting");
    }
}
