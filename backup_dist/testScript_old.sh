#!/bin/sh
echo Running test case 001
java -jar TriangleApp.jar < testcase001.txt &> actResult001.txt
echo Running test case 002
java -jar TriangleApp.jar < testcase002.txt &> actResult002.txt
echo Running test case 003
java -jar TriangleApp.jar < testcase003.txt &> actResult003.txt