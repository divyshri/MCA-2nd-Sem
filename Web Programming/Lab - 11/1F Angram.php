<?php
function is_anagram($a, $b)
{
	 if(count_chars($a, 1)== count_chars($b,1))
	 {
		 return "this two striongs are anagram";
	 }
	 else
	 {
		 return "this two strings are not anagram";
	 }
}
print_r(is_anagram('anagram','nagaram')."\n");
print_r(is_anagram('cat','rat')."\n");
?>