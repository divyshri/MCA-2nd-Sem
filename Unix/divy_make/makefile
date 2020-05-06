output: factorial.o hello.o main.o
	g++ main.o hello.o factorial.o -o output
main.o : main.cpp
	g++ -c main.cpp
hello.o : hello.cpp
	g++ -c hello.cpp
factorial.o : factorial.cpp
	g++ -c factorial.cpp
clean : 
	rm -rf *.o output
