<?php
function single_number($arr)
{
	$result = $arr[0];
	for($i=1;$i<sizeof($arr);$i++)
	{
		$result=$result ^ $arr[$i];
		
	}
	return $result;
	
}
$arr1 = array(5,3,4,3,4);
$arr2 = array(3,2,5,2,1,5,3);
print_r($arr1);
print_r('single number: '.single_number($arr1)."\n");
print_r($arr2);
print_r('single number: '.single_number($arr2)."\n");
?>