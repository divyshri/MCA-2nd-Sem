BEGIN {
	printf "\t\t Employee data \n \n"
}
	$6 > 10000 { 
	count++; totalsal+=$6
	printf "%3d %-20s %-12s %d\n",count,$2,$3,$6 }
END{
	printf" \t\t the average basic salary is %d\n",totalsal/count}
