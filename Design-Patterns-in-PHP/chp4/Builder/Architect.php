<?php 

class Architect {
    public function buildHouse(CarpenterInterface $carpenter) {
        $carpenter->buildWalls(10,  20);
        $carpenter->buildBathrooms([[1, 1], [3, 4]]);
        $carpenter->buildKitchen([[6, 1], [8, 4]]);
        $carpenter->decorateFrontDoor();
        $house = $carpenter->getHouse();
        $this->printHouse($house);
    } 

    public function printHouse(array $house) {
        for ($i = 0; $i < count($house); $i++) {
            for ($j = 0; $j < count($house[$i]); $j++) {
                echo $house[$i][$j];
            }
            echo "\n";
        }
    }
}