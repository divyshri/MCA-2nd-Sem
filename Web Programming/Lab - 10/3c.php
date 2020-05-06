<?php
$my_text = 'the quick [girl].';
preg_match('#\[(.*?)\]#',$my_text,$match);
print $match[1]."\n";
?>