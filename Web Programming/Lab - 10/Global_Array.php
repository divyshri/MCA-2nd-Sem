<html>
<body>
<?php
	$x = 5;
	$y = 10;
	function myfunc()
	{
		$GLOBALS['y'] = $GLOBALS['x'] + $GLOBALS['y'];
	}
	myfunc();
	echo "<h1>Value of y is : $y</h1>";
	
	
?>

</body>

</html>
