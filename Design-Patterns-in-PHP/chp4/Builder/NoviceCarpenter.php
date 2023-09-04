<?php 

class NoviceCarpenter implements CarpenterInterface {
    private $layout = [];

    public function buildWalls(int $x, int $y) {   
        for ($i = 0; $i < $x; $i++) {
            $layout[$i] = [];
            for($j = 0; $j < $y; $j++) {
                $isWall = ($i == 0 )|| ($i == $x - 1) || ($j == 0) || ($j == $y - 1);
                if ($isWall ) {
                    $layout[$i][$j] = '|';
                } else {
                    $layout[$i][$j] = " ";
                }
               
            }
        }
        $this->layout = $layout;
    } 

    public function buildBathrooms(array $coordinates) {     
      $startX = $coordinates[0][0];
      $startY = $coordinates[0][1];
      $endX = $coordinates[1][0];
      $endY =  $coordinates[1][1];
      for($i = $startX; $i <= $endX; $i++ ) {
         for($j = $startY; $j <= $endY; $j++) {
            $this->layout[$i][$j] = 'x';
         }
      }
    }

    public function buildKitchen(array $coordinates) {
        $startX = $coordinates[0][0];
        $startY = $coordinates[0][1];
        $endX = $coordinates[1][0];
        $endY =  $coordinates[1][1];
        for($i = $startX; $i <= $endX; $i++ ) {
           for($j = $startY; $j <= $endY; $j++) {
              $this->layout[$i][$j] = 'K';
           }
        }
    }

    public function decorateFrontDoor() {
        $layout = $this->layout;
       for($i = 0; $i < count($layout); $i++) {
          $layout[$i][count($layout[$i])-1] = '>';
       }
       $this->layout = $layout;
    }

    public function getHouse(): array {
        return $this->layout;
    }
}