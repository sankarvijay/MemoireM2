public class Main {
  public Car createCar(String name){
    Car newCar = carFarm.getNewCar(name);
    carRepository.save(newCar);
    return newCar;
  }
}
