class LuxuryCar: Car {
    public LuxuryCar(Location location): base(CarType.LUXURY, location) {
       PrintMessage();
    }

    public override void PrintMessage()
    {
       Console.WriteLine("Connecting to Luxury Car");
    }
}