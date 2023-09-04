<?php 

class ExpertCarpenter implements CarpenterInterface {
    private $layout = [];

    public function buildWalls(int $x, int $y) {   
        for ($i = 0; $i < $x; $i++) {
            $layout[$i] = [];
            for($j = 0; $j < $y; $j++) {
                 if ($j == 0) {
                    $char = '{';
                } elseif ($i == 0) {
                    $char = '^';
                } elseif ($i == $x - 1) {
                    $char = '^';
                } elseif ($j == $y - 1) {
                    $char = '>';
                } else {
                    $char = ' ';
                }
                $layout[$i][$j] = $char;
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
            $this->layout[$i][$j] = '#';
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
              $this->layout[$i][$j] = 'T';
           }
        }
    }

    public function decorateFrontDoor() {
        $layout = $this->layout;
       for($i = 0; $i < count($layout); $i++) {
          $char = ')';
          $mid1 = count($layout) / 2;
          $mid2 = $mid1;
          if (count($layout) % 2 == 0) {
            $mid2 = $mid1 - 1;
          }
          if ($i == $mid1 || $i == $mid2 ) {
            $char = '>';
          }
          $layout[$i][count($layout[$i])-1] = $char;
       }
       $this->layout = $layout;
    }

    public function getHouse(): array {
        return $this->layout;
    }
}