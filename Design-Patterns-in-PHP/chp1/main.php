<?php
require_once('EmptyGarden.php');
require_once('MarijuanaGarden.php');
require_once('PlotAreaInterface.php');
require_once('RectangleArea.php');

$emptyGarden = new EmptyGarden(new RectangleArea(3, 3));
$items = $emptyGarden->items();
print_r($items);

// $marijuanaGarden = new MarijuanaGarden(3, 3);
// $items = $marijuanaGarden->items();
// print_r($items);