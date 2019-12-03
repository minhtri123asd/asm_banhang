<?php
require "db_connect.php" ;

$username= $_POST["username"];
$password=$_POST["password"];


$query= 'select * from user where name ="'.$username.'" and password = "'.$password.'" ';

$result = mysqli_query($connect,$caulenh) ;
if (mysqli_num_rows($result) == 1) { 
    echo "success" ; }
    else {
    echo "error" ;
    }







?>