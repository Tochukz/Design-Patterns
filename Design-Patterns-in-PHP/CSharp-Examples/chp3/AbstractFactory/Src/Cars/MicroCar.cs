class MicroCar: Car {
    public MicroCar(Location location): base(CarType.MICRO, location) {
       PrintMessage();   
    }

    public override void PrintMessage()
    {
        Console.WriteLine("Connecting to Micro Car");
    }
}

