<?php

class MarijuanaGarden extends EmptyGarden {
  public function items(): array {
    $product = $this->width * $this->height;
    return array_fill(0, $product, 'weed');
  }
}
