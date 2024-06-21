<?php

// INPUT
$minimum_age = 18;
$age = (int)readline("Enter person's age: ");
$is_a_ghanaian = strtolower(readline("Ghanaian? - enter yes or no: "));
$is_mentally_sane = strtolower(readline("Mentally sane? - enter yes or no: "));
$is_valid_id = strtolower(readline("Valid ID? - enter yes or no: "));

// PROCESS
if (($age >= $minimum_age) && $is_a_ghanaian == "yes" && $is_mentally_sane == "yes" && $is_valid_id == "yes")
{
    echo "Person is ELIGIBLE TO VOTE";
}
else
{
    echo "Persion is NOT ELIGIBLE TO VOTE";
}
?>