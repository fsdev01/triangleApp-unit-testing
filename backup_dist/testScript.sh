#!/bin/sh
echo "Running Command Line Tests"

for i in {1..8}
do 
	echo "Running test case 00${i} ... "
	java -jar TriangleApp.jar < testcase00${i}.txt > actResult00${i}.txt 2>&1
	diff expResult00${i}.txt actResult00${i}.txt 
done


