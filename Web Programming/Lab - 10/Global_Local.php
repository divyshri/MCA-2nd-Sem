<html>
<body>
<?php
	$x = 5;
	function myfunc()
	{
		global $x;
		echo "<h1>Variable x iside the function is : $x</h1>";
	}
	myfunc();
	echo "<h1>Variable x outside the function is : $x</h1>";
	
	
	
?>

</body>

</html>
