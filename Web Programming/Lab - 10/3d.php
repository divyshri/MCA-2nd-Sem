<?php
$string = 'abcdef%$hg#DGGH567';
echo 'old string : '.$string.'';
$newstr =  preg_replace("/[A-Za-z0-9 ]/", '',$string);
echo 'ner string : '.$newstr."\n";
?>