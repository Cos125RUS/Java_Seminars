package org.example.Human;

public class Human {
    private Transport curentTransport;

    public void stop(){
        if (curentTransport != null) {
            curentTransport.stop();
            curentTransport = null;
        }
        else System.out.println("Да ты и так стоишь");
    }

    public void drive(Transport transport){
        if (curentTransport == null) {
            transport.start();
            curentTransport = transport;
        }
        else System.out.println("Как ты себе это представляешь?");
    }


//    private Car lastCar;
//    private SkateBoard lastSkate;
//    private Bicycle lastBicycle;
//
//
//    public Human() {
//    }
//
//    public void drive(Car car){
//        car.run();
//        lastCar = car;
//    }
//    public void drive(SkateBoard skate){
//        skate.run();
//        lastSkate = skate;
//    }
//    public void drive(Bicycle bicycle){
//        bicycle.run();
//        lastBicycle = bicycle;
//    }
//
//    public void stop(){
//        if (lastCar != null) {
//            lastCar.stop();
//            lastCar = null;
//        }
//    }
}
