<?php 

class TomatoGarden extends Garden {
    public function harvest() {
        return [new TomatoPlant, new TomatoPlant ];
    }
}