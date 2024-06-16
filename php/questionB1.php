<?php
//B. Q1. Write a PHP script to find the largest of three numbers.
/*
a. Three variables - numbers
b. Take first number and compare with second number
c. If first number is greater than second number, then compare
    first number with the third number.
        --if first number is greater than third number:
            -- answer is first number
        --else answer is third number
    If first number is lesser than second number, then compare
    second number with third number.
        --if second number is greater than third number:
            -- answer is second number
        --else answer is third number
*/

//Input
$first_number = 1000000000;
$second_number = 3500;
$third_number = 2000000;

//Process
if ($first_number > $second_number)
{
    if ($first_number > $third_number)
    {
        echo "Largest number is FIRST number";
    }
}
else
{
    if ($second_number > $third_number)
    {
        echo "Largest number is SECOND number";
    }
    else
    {
        echo "Largest number is THIRD number";        
    }
}
?>