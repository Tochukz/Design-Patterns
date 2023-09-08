<?php 
require_once('Garden.php');
require_once('PlantInterface.php');
require_once('TomatoPlant.php');
require_once('TomatoGarden.php');
require_once('OnionPlant.php');
require_once('OnionGarden.php');

$tomatoGarden = new TomatoGarden();
$onionGarden = new OnionGarden();
$plants = array_merge($tomatoGarden->grow(), $onionGarden->grow());

foreach($plants as $plant) {
    $plant->consume();
}