<?php 
 
class RectangleArea implements PlotAreaInterface {
    private $width;

    private $height;

    public function __construct(int $width, int $height) {
        $this->width = $width;
        $this->height = $height;
    }

    public function totalNumberOfPlots() {
        return ceil($this->width * $this->height / 2);
    }
}
