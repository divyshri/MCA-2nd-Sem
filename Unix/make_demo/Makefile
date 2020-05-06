OBJECTS = print.o fun1.o fun2.o
hello: $(OBJECTS)
	g++ -g $(OBJECTS) -o  print
print.o: main.h fun1.h
fun1.o: fun1.h fun2.h
fun2.o: fun2.h


clean:
	rm -rf *.o
	rm hello
