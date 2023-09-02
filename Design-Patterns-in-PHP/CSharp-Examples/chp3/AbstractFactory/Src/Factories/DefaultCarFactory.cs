class DefaultFactory {
    public static Car? BuildCar(CarType model) {
        Car? car = null;
        switch(model) {
            case CarType.MICRO: 
                car = new MicroCar(Location.DEFAULT);
                break;
            case CarType.MINI:
                car = new MiniCar(Location.DEFAULT);
                break;
            case CarType.LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
            default: 
                break;
        }
        return car;
    }
}