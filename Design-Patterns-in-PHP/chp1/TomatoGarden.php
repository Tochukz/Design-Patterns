<?php

class TomatoGarden extends EmptyGarden {
  public function items(): array {
    $numberOfSpots = $this->plot->totalNumberOfPlots();
    return array_fill(0, $numberOfSpots, 'tomato');
  }
}
