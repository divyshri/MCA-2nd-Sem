<?php
function check_palindrom($string)
{
	if($string == strrev($string))
		return "this string  is  palindrom";
	else 
		return "this string  is not  palindrom";
}
echo check_palindrom('madam')."\n";
?>