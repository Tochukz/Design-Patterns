<?php

interface CarpenterInterface {
    public function buildWalls(int $width, int $length);

    public function buildBathrooms(array $coordinates);

    public function buildKitchen(array $coordinates);

    public function decorateFrontDoor();

    public function getHouse(): array;
}