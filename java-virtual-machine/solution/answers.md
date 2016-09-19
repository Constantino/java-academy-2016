#In your own words what is the JVM?
######It's someting that can take a pre-compiled code and then handle it to compile it even deeper so it can interact with a specific operating system, so the programmer does not have to prepare code for a specific platform, it's the virtual machine of that operating system who's going to take care of it.

#What about JIT? What is it?
######Just-In-Time compiler, takes de bytecode and compiles it to native code.

#How can you execute GC?
######System.gc();

#What are the downsides of GC?
######It has impact on performance
######Programmers loose control over memory management as it is invoked by the JVM

#In few words what can you say about the heap space?
######It's the place where we have the objects of young generation and old generation

#What about PermGen? How to increase?
######Permanent Generation, it stores classes and interned strings. We can increase by this command: -XX:MaxPermSize=[value]

#How to increase Java heap?
######Xmxn
######Specify the maximum size, in bytes, of the memory allocation pool. This value must a multiple of 1024 greater than 2MB. Append the letter k or K to indicate kilobytes, or m or M to indicate megabytes. The default value is chosen at runtime based on system configuration.
######Examples:
######	-Xmx83886080
######    -Xmx81920k
######    -Xmx80m

#Explain Hotspot Heap structure
######Young generation:
######	Eden: Initial objects
######	Survival space: Objects that survive a GC
######Old generation:
######	Tenured: Long lived objects

#Give two scenarios where you can get an OutOfMemoryError error
######1) Out of Heap space
######2) Out of PermGen space

#How can VM technology be beneficial for slow programs?
######We have a Garbage Collector to take care of our memory
######Programmers focus on application logic instead of dealing with the specific operating system requirements to process
