<?php

// INPUT
$minimum_age = 18;
$age = (int)readline("Enter person's age: ");
$ghanaian = (bool)readline("Enter true or false for nationality: ");
$mentally_sane = (bool)readline("Enter true or false for mental sanity: ");
$valid_id = (bool)readline("Enter true or false for ID: ");

// PROCESS
if ($age >= $minimum_age && $ghanaian == true && $mentally_sane == true && $valid_id == true)
{
    echo "Person is ELIGIBLE TO VOTE";
}
else
{
    echo "Persion is NOT ELIGIBLE TO VOTE";
}
?>