<?php
require_once('Architect.php');
require_once('CarpenterInterface.php');
require_once('NoviceCarpenter.php');
require_once('ExpertCarpenter.php');

$architect  = new Architect();
$carpenter1 = new NoviceCarpenter();
$carpenter2 = new ExpertCarpenter();

echo "Built by novice carpenter: \n";
$architect->buildHouse($carpenter1);

echo "\n\n";
echo "Built by expert carpenter: \n";
$architect->buildHouse($carpenter2);

