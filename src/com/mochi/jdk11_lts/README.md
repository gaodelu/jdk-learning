### JDK11新特性
- String新增方法(trim()、strip()、repeat()、lines..)
- 简化编译运行程序

    当一个java文件中没有引用其他类，则不会输出编译class文件，直接执行main方法
- 增加unicode10
- 新增epsilon收集器
- 完全支持linux容器（包括docker）

  jdk11以前的java应用程序在docker中运行的性能会下降，但现在此问题在容器控制组(cgroups)的帮助下得以解决，使JVM和docker配合得更加默契
- FlightRecorder

    用来记录java程序的运行，现在从商业版中开源出来了。
    有两种使用方式：程序开始前，添加-XX:StartFilghtRecording参数；也可以在程序启动后，通过jcmd命令启动jfr
- 标准HTTP Client升级
  
  支持异步调用
## ZGC：可伸缩低延迟辣鸡收集器

GC 是一个可伸缩的、低延迟的垃圾收集器，主要为了满足如下目标进行设计：
- GC 停顿时间不超过 10ms 即能处理几百 MB 的小堆，也能处理几个 TB 的大堆 
- 应用吞吐能力不会下降超过 15%（与 G1 回收算法相比） 
- 方便在此基础上引入新的 GC 特性和利用 colord 
- 针以及 Load barriers 优化奠定基础
- 当前只支持 Linux/x64 位平台 停顿时间在 10ms 以下，10ms 其实是一个很保守的数据，即便是 10ms 这个数据，也是 GC 调优几乎达不到的极值。根据 SPECjbb 2015 的基准测试，128G 的大堆下最大停顿时间才 1.68ms，远低于 10ms，和 G1 算法相比，改进非常明显。
