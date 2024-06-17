<?php
// Online PHP compiler to run PHP program online

// INPUT
$password = readline("Enter password: ");

// PROCESS
$password_length = strlen($password);
if ($password_length >= 8)
{
    echo "PASS - password VALID";
}
else
{
    echo "FAIL - password is less than 8 characters long";
}
?>