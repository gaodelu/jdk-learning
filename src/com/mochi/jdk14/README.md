# jdk14新特性
## instanceof增强  instanceof的模式匹配
## switch表达式修改，引入yield
## Helpful NullPointerExceptions 有用的NPE

  在之前抛出NPE异常时只会提示哪一行出错了，但是那一行有多个操作，无法分辨出那个是null。
## 引入record记录类型
## 堆外内存访问api

从 Java14 开始，Java 的设计者们在语法层面为大家带来了崭新的 Memory Access API，极大程度上简化了开发难度，并得以有效的解决了安全性和高效性等 2 个核心问题。

```

// 获取内存访问var句柄
var handle = MemoryHandles.varHandle(char.class,
        ByteOrder.nativeOrder());
// 申请200字节的堆外内存
try (MemorySegment segment = MemorySegment.allocateNative(200)) {
    for (int i = 0; i < 25; i++) {
        handle.set(segment, i << 2, (char) (i + 1 + 64));
        System.out.println(handle.get(segment, i << 2));
    }
}
```
## FlightRecorder增强

  在JDK11中JFR只能将运行的数据导出文件，然后通过JMC可视化，这个过程太繁琐也不能应用于实时的监控，所以在JDK14中推出了JFR事件流。通过这个功能可以实时获取到JVM的运行情况。
## 非易失性映射的字节缓冲

  新的特定于jdk的文件映射模式，以便可以使用FileChannel API创建引用非易失性内存的MappedByteBuffer实例。在non-vllatile的情况下，如果像RAM一样关闭电源，数据也不会保留。唯一需要更改的API是FileChannel客户端使用的新枚举，用于请求位于NVM支持的文件系统（而不是传统的文件存储系统）上的文件的映射。

## 删除CMS垃圾回收器

因为 CMS 回收算法在进行 GC 回收内存过程中是使用并行方式进行的，如果服务器 CPU 核数不多的情况下，进行 CMS 垃圾回收有可能造成比较高的负载。同时在 CMS 并行标记和并行清理时，应用线程还在继续运行，程序在运行过程中自然会创建新对象、释放不用对象，所以在这个过程中，会有新的不可达内存地址产生，而这部分的不可达内存是出现在标记过程结束之后，本轮 CMS 回收无法在周期内将它们回收掉，只能留在下次垃圾回收周期再清理掉。这样的垃圾就叫做浮动垃圾。由于垃圾收集和用户线程是并发执行的，因此 CMS 回收器不能像其他回收器那样进行内存回收，需要预留一些空间用来保存用户新创建的对象。由于 CMS 回收器在老年代中使用标记-清除的内存回收策略，势必会产生内存碎片，内存当碎片过多时，将会给大对象分配带来麻烦，往往会出现老年代还有空间但不能再保存对象的情况。

当在 Java 14 版本中，通过使用参数： -XX:+UseConcMarkSweepGC，尝试使用 CMS 时，将会收到下面信息：

    ---jdk14----
    Java HotSpot(TM) 64-Bit Server VM warning: Ignoring option UseConcMarkSweepGC; 
    support was removed in <version>

    ----jdk17----
    Unrecognized VM option 'UseConcMarkSweepGC'
    Error: Could not create the Java Virtual Machine.
    Error: A fatal exception has occurred. Program will exit.

## 打包工具

创建用于打包自包含 Java 应用程序的工具。 
它基于 JavaFX javapackager 工具创建一个简单的打包工具，主要目标是： 
- 支持原生打包格式，为最终用户提供自然的安装体验。这些格式包括 Windows 上的 msi 和 exe，macOS 上的 pkg 和 dmg，以及 Linux 上的 deb 和 rpm。
- 允许在打包时指定启动时间参数。 
- 可以从命令行直接调用，也可以通过 ToolProvider API 以编程方式调用。