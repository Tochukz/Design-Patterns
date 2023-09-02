class MiniCar: Car {
    public MiniCar(Location location): base(CarType.MINI, location) {
        PrintMessage();
    }

    public override void PrintMessage()
    {
        Console.WriteLine("Connecting to Mini Car");
    }
}