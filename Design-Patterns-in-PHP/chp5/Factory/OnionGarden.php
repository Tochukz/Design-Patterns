<?php 

class OnionGarden extends Garden {
    public function harvest() {
        return [new OnionPlant, new OnionPlant ];
    }
}