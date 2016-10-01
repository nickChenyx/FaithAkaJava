#Something about interned string

*String interning:*  

>In computer science, string interning is a method of storing only one copy of each distinct string value, which must be immutable. Interning strings makes some string processing tasks more time- or space-efficient at the cost of requiring more time when the string is created or interned. The distinct values are stored in a string intern pool.    --[Wikiwand](https://www.wikiwand.com/en/String_interning)

*Implement in java:*  

>String literals are automatically interned by the compiler and added into the symbol table when the class is loaded. In addition instances of the String class can be explicitly interned by calling String.intern(). When String.intern() is called, if the symbol table already contains the string then a reference to this is returned, if not the string is added to the string table and its reference is returned.  --[JVM Internals](http://blog.jamesdbloom.com/JVMInternals.html#where_is_the_method_area)



*explicitly expound String.intern:*  
[Java Performance Tuning Guide---String.intern in Java 6, 7 and 8 – string pooling](http://java-performance.info/string-intern-in-java-6-7-8/)

*illustrate maybe can distinguish better:*
[深入理解 Java String#intern() 内存模型](http://developer.51cto.com/art/201503/469521.htm)

*extras:*  
1>  
>PermGen is the permanent generation of objects in the VM (Class names, internalized strings, objects that will never get garbage-collected). An easy, if somewhat memory-hungry fix is to enlarge the maximum space for these objects by adding -XX:MaxPermSize=128M.  

This is the result that i seached "PermGen" in [google](https://www.goole.com/ncr),maybe you can find some issues after learning above.(difference between java6 and java7 roughly)

  

2>  
*jvm tuning and monitoring:*
[Java系列笔记(4) - JVM监控与调优](http://www.cnblogs.com/zhguang/p/Java-JVM-GC.html) (a lot of new knowledge for me...mark)  
  
[java可视化监控工具](http://www.codes51.com/article/detail_433473.html) JConsole could monitor runtime data if you run the program that provided by the [Java Performance Tuning Guide---String.intern in Java 6, 7 and 8 – string pooling](http://java-performance.info/string-intern-in-java-6-7-8/)



