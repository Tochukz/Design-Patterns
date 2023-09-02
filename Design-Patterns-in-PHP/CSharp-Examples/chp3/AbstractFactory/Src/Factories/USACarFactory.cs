class USACarFactory {
    public static Car? BuildCar(CarType model) {
        Car? car  = null;
        switch(model) {
            case CarType.MICRO: 
                car = new MicroCar(Location.USA);
                break;
            case CarType.MINI:
                car = new MiniCar(Location.USA);
                break;
            case CarType.LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
            default: 
                break;
        }
        return car;
    }
}