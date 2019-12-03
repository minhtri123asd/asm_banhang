<?php
require "db_connect.php";


$name = $_POST['nameUSER'] ;
$email=$_POST['emailUSER'];
$password=$_POST['passwordUSER'];

$query = "INSERT INTO  user  VALUES(null, '$name' ,'$email','$password')";

if (mysqli_query( $connect ,$query)) {
    echo "success";
}
else {
    echo "error";
}
