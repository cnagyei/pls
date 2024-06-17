<?php
/*
1. Get input string
2. Reverse the string and save in another variable - strrev()
3. Compare original string with input string - strcmp()
*/

// INPUT
$input_string = strtolower(readline("Enter any word: "));
$reversed_string = strtolower(strrev($input_string));
$compare_strings = strcmp($input_string, $reversed_string);

if ($compare_strings == 0)
{
    echo "String is a PALINDROME";
}
else
{
    echo "String is NOT a PALINDROME";
}
?>