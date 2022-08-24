# JDK9新特性
## 新功能和库的更新
### Optional

### 接口新增私有方法
--> PrivateInterfaceMethod.java

--> PrivateInterfaceTest.java
### 钻石操作符(泛型)的升级
-->DiamondTest.java
### 支持在try外进行实例化

支持在try外进行实例化，try内对象为final不可再修改； 结束后自动释放

--> NewTryCatch.java
### String存储结构发生变化

char[]修改为byte[]，String，StringBuffer，StringBuilder

### 集合调整-快速创建只读集合
-->QuickUnmodifyable.java

### 增强流API
- takeWhile()
- dropWhile()
- of()
- ofNullable()
- iterator增加结束条件

-->NewInterator.java/EnhanceStream.java

### I/O流新特性

- readAllBytes：读取 InputStream 中的所有剩余字节。 
- readNBytes： 从 InputStream 中读取指定数量的字节到数组中。 
- transferTo：读取 InputStream 中的全部字节并写入到指定的 OutputStream 中。

### HttpClient重写
HttpClient增加异步调用 sendAsync()

## JVM优化

## 其他功能
### "_"为关键字，不可作为变量名
### JShell
　使用jshell命令启动jshell，输入表达式即可实现基本功能运算
```
jshell> int add(int x, int y) {
    ...> return x + y;
    ...> }

jshell> add(1, 2)
$2 ==> 3

```

### 改进应用安全性能

新增4个SHA-3哈希算法，SHA3-224，SHA3-256，SHA3-384和SHA3-512。另外也增加了通过 java.security.SecureRandom 生成使用 DRBG 算法的强随机数

### 多分辨率图像API
### 统一的jvm日志系统