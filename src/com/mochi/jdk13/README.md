# jdk13新特性
## 支持unicode12.1
## 动态CDS归档

通过在64位平台上的默认类列表的帮助下生成CDS归档来改进JDK构建过程，从而有效地消除了运行java -Xshare：dump。 
此功能的目标包括： 
- 改进开箱即用的启动时间 
- 摆脱使用-Xshare：dump
## java.net.Socket和java.net.ServerSocket API的重新实现

引入 NioSocketImpl 的实现用以替换 SocketImpl 的 PlainSocketImpl 实现，此实现与 NIO（新 I/O）实现共享相同的内部基础结构，并且与现有的缓冲区高速缓存机制集成在一起，因此不需要使用线程堆栈。

## ZGC增强

Java 13 中对 ZGC 的改进，主要体现在下面几点：
- 释放未使用内存给操作系统
- 支持最大堆大小为 16TB
- 添加参数：-XX:SoftMaxHeapSize 来软限制堆大小

与雪弗兰异同：

- 相同点：性能几乎可认为是相同的 
- 不同点：ZGC是Oracle JDK的。而Shenandoah只存在于OpenJDK中，因此使用时需注意你的JDK版本 
- 打开方式：使用-XX:+UseShenandoahGC命令行参数打开。 
    
## 文本块（预览语言功能）