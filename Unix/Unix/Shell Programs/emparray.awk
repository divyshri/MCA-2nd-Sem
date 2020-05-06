BEGIN{
	printf "%40s\n", "\t Basic DA HRA GROSS "
}
{
	da=0.25*$6 ;
	hra=.50*$6;
	gp=$6+hra+da
	tot[1]+=$6; tot[2]+=da; tot[3]+=hra; tot[4]+=gp
	count++
}
END{
	printf"\t\tAverage %5d %5d %5d %5d\n",
	tot[1]/count, tot[2]/count ,tot[3]/count, tot[4]/count
	}
