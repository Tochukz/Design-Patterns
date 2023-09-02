<?php

/**
* @purpose
*
* Provides empty garden space full of dirt which can grow and produce items.
*/

class EmptyGarden {
    public $plot;

    public $height;

    public function __construct(PlotAreaInterface $plot) {
        $this->plot = $plot;
    }

    public function items(): array {
        $numberOfSpots = $this->plot->totalNumberOfPlots();
        return array_fill(0, $numberOfSpots, 'hand full of dirt');
    }
}