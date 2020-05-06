<?php
function prime($n)
{
for($x=2;$x<$n;$x++)
{
if($n % $x==0)
{
return 0;
}
}
return 1;
}
$a = prime(3);
$a = prime(6);
if($a==0)
echo 'this is not prime...'."\n";
else
echo  'this is prime...'."\n";

?>