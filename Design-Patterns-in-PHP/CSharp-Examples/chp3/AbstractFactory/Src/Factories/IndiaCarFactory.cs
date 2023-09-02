class IndiaCarFactory {
    public static Car? BuildCar(CarType model) {
        Car? car = null;
        switch(model) {
            case CarType.MICRO: 
                car = new MicroCar(Location.INDIA);
                break;
            case CarType.MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case CarType.LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
            default: 
              break;
        }
        return car;
    }
}