abstract class Car {
    CarType Model {set; get; }

    Location Location { set; get; }

    public Car(CarType model, Location location) {
        Model = model;
        Location = location;
    }

    public override string ToString() {
        return $"CarModel - {Model} located in {Location}";
    }

    public abstract void PrintMessage();
}