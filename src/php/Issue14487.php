<?php
fscanf(STDIN,"%d",$iCount);
$aTownCostList = explode(" ", fgets(STDIN));

$iMaxTownCost = 0;
$iSum = 0;

foreach ($aTownCostList as $sTownCost) {
    $iTownCost = (int) $sTownCost;
    $iSum += $iTownCost;

    if ($iTownCost > $iMaxTownCost) {
        $iMaxTownCost = $iTownCost;
    }
}

fprintf(STDOUT,"%d", $iSum - $iMaxTownCost);