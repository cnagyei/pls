<?php

// INPUT
$minimum_age = 18;
$age = (int)readline("Enter person's age: ");


// PROCESS
if ($age >= $minimum_age)
{
    $ghanaian = (bool)readline("Enter true or false for nationality: ");
    if ($ghanaian == true)
    {
        $mentally_sane = (bool)("Enter true or false for mental sanity: ");
        if ($mentally_sane == true)
        {
            $valid_id = (bool)("Enter true or false: ");
            if ($valid_id == true)
            {
                echo "Person is ELIGIBLE to vote";
            }
            else
            {
                echo "Person is NOT eligible. Reason: INVALID ID";
            }
        }
        else
        {
            echo "Person is NOT eligible. Reason: NOT SANE";
        }
    }
    else
    {
        echo "Person is NOT eligible. Reason: NOT GHANIAN";
    }
}
else
{
    echo "Person is NOT eligible. Reason: DOES NOT MEET MINIMUM AGE";
}
?>