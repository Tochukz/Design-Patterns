class CarFactory {
    public static Car? BuildCar(CarType model) {
        Location location = Location.INDIA;
        Car? car = null;
        switch(location) {
            case Location.USA: 
                car = USACarFactory.BuildCar(model);
                break;
            case Location.INDIA:
                car = IndiaCarFactory.BuildCar(model);
                break;
            default: 
                car = DefaultFactory.BuildCar(model);
                break;
        }
        return car;
    }
}