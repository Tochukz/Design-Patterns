<?php
require_once('EmptyGarden.php');
require_once('TomatoGarden.php');
require_once('PlotAreaInterface.php');
require_once('RectangleArea.php');

$emptyGarden = new EmptyGarden(new RectangleArea(3, 3));
$items = $emptyGarden->items();
print_r($items);

$tomatoGarden = new TomatoGarden(new RectangleArea(3, 3));
$items = $tomatoGarden->items();
print_r($items);