package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> carList = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car){
        if(car.getPrice()<=maxPrice){
            carList.add(car);
            return true;
        }
        return false;
    }

    public int sumCarPrice(){
        int sumCarPrice=0;
        for (Car car:carList) {
            sumCarPrice+=car.getPrice();
        }
        return sumCarPrice;
    }

    public int numberOfCarsCheaperThan(int price){
        int numberOfCars=0;
        for (Car car:carList) {
            if(car.getPrice()<=price){
                numberOfCars++;
            }
        }
        return numberOfCars;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> brandList = new ArrayList<>();
        for (Car car:carList) {
            if(brand.equals(car.getBrand())){
                brandList.add(car);
            }
        }
        return brandList;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carList;
    }
}